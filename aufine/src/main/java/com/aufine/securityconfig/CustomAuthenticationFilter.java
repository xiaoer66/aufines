package com.aufine.securityconfig;

import com.aufine.bean.AjaxResponseBody;
import com.google.gson.Gson;
import com.aufine.redis.LoginInfos;
import com.aufine.util.DateUtils;
import com.aufine.util.PrintWriterUtil;
import com.aufine.util.RedisUtil;
import com.aufine.util.common.AufineSystemConfig;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;


/**
 * 验证用户名密码正确后，生成一个token，并将token返回给客户端
 * 该类继承自UsernamePasswordAuthenticationFilter，重写了其中的几个方法 ,
 * attemptAuthentication：接收并解析用户凭证。
 * successfulAuthentication：用户成功登录后，这个方法会被调用，在这个方法里生成token并返回。
 * unsuccessfulAuthentication：用户登陆失败后，这个方法会被调用。
 */
public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;
    Gson gson=new Gson();

    public CustomAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>()));
    }






    /**
     * 登陆失败处理
     * @param request
     * @param response
     * @param failed
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        //登陆失败返回信息,验证顺序在验证密码错误后
        AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
        ajaxResponseBody.setStatus("300");
        ajaxResponseBody.setMsg("用户名或密码错误!");
        PrintWriterUtil.returnStr(response,ajaxResponseBody);
    }

    /**
     * 登陆成功处理
     * @param request
     * @param response
     * @param chain
     * @param auth
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
                                            Authentication auth) throws IOException, ServletException {
        //获取当前时间
        Date nowDate=new Date();
        Claims claims = Jwts.claims();
        claims.put("role", auth.getAuthorities().stream().map(s -> s.getAuthority()).collect(Collectors.toList()));
        //token签发时间
        claims.setIssuedAt(nowDate);
        //token过期时间
        claims.setExpiration(DateUtils.dateAddMinutes(nowDate,AufineSystemConfig.expirationTime));
        //系统时间之前的token都是不可以被承认的
        //claims.setNotBefore(DateUtils.dateAddSeconds(nowDate,10));
        //设置token
        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setClaims(claims);
        jwtBuilder.setSubject(auth.getName());
        jwtBuilder.signWith(SignatureAlgorithm.HS512, AufineSystemConfig.signingKey);
        //jwt最终生成的token
        String token = jwtBuilder.compact();
        //登陆成功后，保存token相关信息到redis中
        LoginInfos loginInfos=new LoginInfos();
        loginInfos.setUsername(auth.getName());
        loginInfos.setIssuedAt(claims.getIssuedAt());
        loginInfos.setExpiration(claims.getExpiration());
        loginInfos.setToken(token);
        RedisUtil.set(loginInfos.getUsername(),gson.toJson(loginInfos));
        //登陆成功返回信息
        response.setHeader("AFToken",token);
        AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
        ajaxResponseBody.setStatus("200");
        ajaxResponseBody.setMsg("登陆成功");
        //如果有需要的信息，可以在此查询后返回object
        ajaxResponseBody.setResult(null);
        ajaxResponseBody.setToken(token);
        PrintWriterUtil.returnStr(response,ajaxResponseBody);
    }
}
