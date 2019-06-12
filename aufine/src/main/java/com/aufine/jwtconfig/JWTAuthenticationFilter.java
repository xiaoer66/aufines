package com.aufine.jwtconfig;

import com.aufine.util.*;
import com.aufine.bean.AjaxResponseBody;
import com.google.gson.Gson;
import com.aufine.util.common.AufineSystemConfig;
import io.jsonwebtoken.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * JWT配置拦截器
 */
public class JWTAuthenticationFilter extends BasicAuthenticationFilter {

    Gson gson=new Gson();

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    /**
     * 在拦截器中获取token并解析，拿到用户信息，放置到SecurityContextHolder，这样便完成了springsecurity和jwt的整合。
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
            ajaxResponseBody.setStatus("403");
            ajaxResponseBody.setMsg("签名未携带!");
            PrintWriterUtil.returnStr(response,ajaxResponseBody);
            return;
        }
        UsernamePasswordAuthenticationToken authentication = null;
        try {
            authentication = getAuthentication(request);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            chain.doFilter(request, response);
        } catch (SignatureException e) {
            AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
            ajaxResponseBody.setStatus("403");
            ajaxResponseBody.setMsg("验签失败,请检查签名!");
            PrintWriterUtil.returnStr(response,ajaxResponseBody);
        } catch (ExpiredJwtException e){
            AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
            ajaxResponseBody.setStatus("403");
            ajaxResponseBody.setMsg("签名过期,请重新登陆!");
            PrintWriterUtil.returnStr(response,ajaxResponseBody);
        } catch (PrematureJwtException e){
            //未生效token处理
            AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
            ajaxResponseBody.setStatus("401");
            ajaxResponseBody.setMsg("签名还未生效,请稍后!");
            PrintWriterUtil.returnStr(response,ajaxResponseBody);
        }
    }

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        String nowRedisToken= null;
        try {
            String[] tokens=token.split("\\.");

            String jsons=gson.toJson(Base64Util.decode_JDK18(tokens[1]));
            Map<String,Object> payloadMap=new HashMap<>();
            payloadMap=gson.fromJson(CharacterUtils.disposeJson(jsons),payloadMap.getClass());
            String nowRedisUser=payloadMap.get("sub").toString();
            String nowRedisUserInfos= RedisUtil.get(nowRedisUser).toString();
            Map<String,Object> nowRedisUserInfosMap=new HashMap<>();
            nowRedisUserInfosMap=gson.fromJson(nowRedisUserInfos,nowRedisUserInfosMap.getClass());
            nowRedisToken = nowRedisUserInfosMap.get("token").toString();
        } catch (Exception e) {
            //e.printStackTrace();
            throw new SignatureException("系统内签名异常!");
        }

        if(nowRedisToken.equals(token.replace("Bearer ", ""))){
                Claims claims = Jwts.parser()
                        .setSigningKey(AufineSystemConfig.signingKey)
                        .parseClaimsJws(nowRedisToken)
                        .getBody();
                String user  = claims.getSubject();
                List<String> roles = claims.get("role", List.class);
                List<SimpleGrantedAuthority> auth = roles.stream().map(s -> new SimpleGrantedAuthority(s)).collect(Collectors.toList());
                int isExp= DateUtils.dateCompare(new Date(),claims.getExpiration());
                if (user != null&&isExp<=0) {
                    return new UsernamePasswordAuthenticationToken(user, null, auth);
                }
                return null;
        }else{
            throw new SignatureException("当前token签名与请求签名不一致!");
        }
    }
}
