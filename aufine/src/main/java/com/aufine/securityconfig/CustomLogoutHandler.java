package com.aufine.securityconfig;

import com.aufine.bean.AjaxResponseBody;
import com.google.gson.Gson;
import com.aufine.util.Base64Util;
import com.aufine.util.CharacterUtils;
import com.aufine.util.PrintWriterUtil;
import com.aufine.util.RedisUtil;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 注销操作类
 */
@Component
public class CustomLogoutHandler implements LogoutSuccessHandler {

    Gson gson=new Gson();

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        String token = httpServletRequest.getHeader("Authorization");
        if (token != null) {
            /*Claims claims = null;
                claims = Jwts.parser()
                        .setSigningKey(AufineSystemConfig.signingKey)
                        .parseClaimsJws(token.replace("Bearer ", ""))
                        .getBody();
            claims.setExpiration(new Date());*/
            /*
            原先是打算注销时，设置当前redis内的token过期时间为当前时间，后来发现没必要，
            因为要注销了，不管有效无效，直接移除redis内该用户信息即可，因为系统每次判断
            用户是否登陆都会去验证redis内的token信息，所以不管登陆的token失效与否都被拦截了。
            */
            @UniqueElements
            String[] tokens=token.split("\\.");
            if(tokens.length>2){
                String jsons=gson.toJson(Base64Util.decode_JDK18(tokens[1]));
                Map<String,Object> payloadMap=new HashMap<>();
                payloadMap=gson.fromJson(CharacterUtils.disposeJson(jsons),payloadMap.getClass());
                String nowRedisUser=payloadMap.get("sub").toString();
                RedisUtil.delete(nowRedisUser);
                /*//重新设置token
                LoginInfos loginInfos=new LoginInfos();
                loginInfos.setUsername(authentication.getName());
                loginInfos.setIssuedAt(claims.getIssuedAt());
                //此处重要,是把redis中的用户token信息过期时间设置为当前时间.
                loginInfos.setExpiration(new Date());
                loginInfos.setToken(token);
                RedisUtil.set(loginInfos.getUsername(),gson.toJson(loginInfos));*/
                AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
                ajaxResponseBody.setStatus("200");
                ajaxResponseBody.setMsg("注销成功!");
                PrintWriterUtil.returnStr(httpServletResponse,ajaxResponseBody);
            }else{
                AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
                ajaxResponseBody.setStatus("400");
                ajaxResponseBody.setMsg("注销失败,token无效!");
                PrintWriterUtil.returnStr(httpServletResponse,ajaxResponseBody);
            }
        }else{
            AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
            ajaxResponseBody.setStatus("400");
            ajaxResponseBody.setMsg("注销失败,未携带token!");
            PrintWriterUtil.returnStr(httpServletResponse,ajaxResponseBody);
        }
    }
}
