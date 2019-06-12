package com.aufine.securityconfig;

import com.aufine.securityconfig.CustomUserDetails;
import com.aufine.service.RoleInfoService;
import com.aufine.service.UserInfoService;
import com.aufine.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 *  登陆用户信息构成
 */
@Component
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    RoleInfoService roleInfoService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //构建用户信息的逻辑(取数据库/LDAP等用户信息)
        CustomUserDetails customUserDetails = new CustomUserDetails();
        customUserDetails.setUsername(username); // 任意用户名登录
        //从数据库中获取密码
        UserInfo userInfo=userInfoService.getUserInfoByUserName(username);
        if(userInfo!=null){
            customUserDetails.setPassword(userInfo.getPassword());// 从数据库中获取的用户密码,是密文 无需再次加密
            customUserDetails.setUserID(userInfo.getUserid());
            Set<GrantedAuthority> authoritiesSet = new HashSet();
            // 根据当前用户信息，查询拥有的角色权限信息，存入GrantedAuthority中
            HashMap<String,Object> paramsMap=new HashMap<>();
            paramsMap.put("userID",userInfo.getUserid());
            List<HashMap<String,Object>> roleInfosMap=roleInfoService.getRoleInfoByUserID(paramsMap);
            for(HashMap<String,Object> rmap : roleInfosMap){
                authoritiesSet.add(new SimpleGrantedAuthority(rmap.get("roleName").toString().trim()));
            }
            /*
            map循环 需要可以用
            for(HashMap.Entry<String,Object> map:roleInfosMap.entrySet()){
                authoritiesSet.add(new SimpleGrantedAuthority(map.getValue().toString().trim()));
            }*/
            customUserDetails.setAuthorities(authoritiesSet);
            return customUserDetails;
        }else{
            return null;
        }
    }
}
