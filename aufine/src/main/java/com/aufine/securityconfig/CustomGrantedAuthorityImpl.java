package com.aufine.securityconfig;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class CustomGrantedAuthorityImpl implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return null;
    }
}
