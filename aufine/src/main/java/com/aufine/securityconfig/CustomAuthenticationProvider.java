package com.aufine.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * 登录验证处理逻辑
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    CustomUserDetailsServiceImpl customUserDetailsService;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = (String) authentication.getPrincipal(); // 这个获取表单输入中返回的用户名;
        //前端传递的都是密文MD5 一次加密
        String password = (String) authentication.getCredentials(); // 这个是表单中输入的密码;
        UserDetails userInfo = customUserDetailsService.loadUserByUsername(userName);
        //boolean b=MD5Utils.getSaltverifyMD5(password, userInfo.getPassword());
        if(userInfo!=null){
            if (MD5Utils.getSaltverifyMD5(password, userInfo.getPassword())) {
                return new UsernamePasswordAuthenticationToken(userName, password, userInfo.getAuthorities());
            }else{
                //密码错误后需要做的操作可以在此
                System.out.println("用户密码验证错误!");
                return null;
            }
        }else{
            System.out.println("用户不存在");
            return null;
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
