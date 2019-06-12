package com.aufine.securityconfig;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomAccessDecisionManager implements AccessDecisionManager {
    /**
     * 决策方法：权限判断
     *
     * @param authentication   用户的身份信息;
     * @param o           包含客户端发起的请求的request信息，可转换为 HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
     * @param collection 是MyInvocationSecurityMetadataSource的getAttributes(Object object)这个方法返回的结果，
     *                         此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限;如果不在权限表中则放行。
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {

        boolean isAuth=false;
        for(GrantedAuthority ga : authentication.getAuthorities()){
            for (ConfigAttribute col:collection){
                if(ga.getAuthority().contains(col.getAttribute())){
                    isAuth=true;
                }
            }
        }
        if(!isAuth){
            throw new AccessDeniedException("无权限403,这里拦截器就捕捉了，此处返回异常就可以");
        }
    }

    public static void main(String[] args) {

    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        //return false;
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        //return false;
        return true;
    }
}
