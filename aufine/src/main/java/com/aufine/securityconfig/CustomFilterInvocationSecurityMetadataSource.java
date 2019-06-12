package com.aufine.securityconfig;

import com.aufine.service.PermissionInfoService;
import com.aufine.bean.PermissionRoleBean;
import com.aufine.entity.RoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource{
    @Autowired
    private PermissionInfoService permissionInfoService;

    AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        List<PermissionRoleBean> allPermissionRole = permissionInfoService.getAllPermission();
        for (PermissionRoleBean permissionRoleBean : allPermissionRole) {
            if (antPathMatcher.match(permissionRoleBean.getPermissionurl(), requestUrl)
                    &&permissionRoleBean.getRoleInfos().size()>0) {
                List<RoleInfo> roles = permissionRoleBean.getRoleInfos();
                int size = roles.size();
                String[] values = new String[size];
                for (int i = 0; i < size; i++) {
                    values[i] = roles.get(i).getRolename();
                }
                return SecurityConfig.createList(values);
            }
        }
        //没有匹配上的资源，都是登录访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
