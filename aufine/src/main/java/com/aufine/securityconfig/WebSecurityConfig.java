package com.aufine.securityconfig;

import com.aufine.jwtconfig.JWTAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

/**
 * security 配置类
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;
    // 自定义决策管理器
    @Autowired
    private CustomAccessDecisionManager customAccessDecisionManager;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
                // 设置权限过滤器
        http.authorizeRequests()
                // 设置任何请求,登录后才可以访问
                .anyRequest()
                // 都需要身份认证
                .authenticated()
                // 设置所有人都可以访问的页面
                .antMatchers("/login.html").permitAll()
                //用and来表示配置过滤器结束，以便进行下一个过滤器的创建和配置
                .and()
                .formLogin()
                .and()
                //禁用CSRF
                .csrf().disable()
                // 将自定义的过滤器配置在FilterSecurityInterceptor之前
                .addFilterBefore(myFilterSecurityInterceptor(), FilterSecurityInterceptor.class)
                //JWT相关拦截器设置
                .addFilter(new CustomAuthenticationFilter(authenticationManager()))
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                //注销处理器
                .logout().logoutSuccessHandler(getLogoutSuccessHandler())
                .and()
                //无权限处理器
                .exceptionHandling().accessDeniedHandler(getAccessDeniedHandler());
    }

    @Bean
    public AccessDeniedHandler getAccessDeniedHandler() {
        return new CustomAuthenticationAccessDeniedHandler();
    }
    @Bean
    public LogoutSuccessHandler getLogoutSuccessHandler() {
        return new CustomLogoutHandler();
    }
    /**
     * 管理自定义的权限过滤器
     */
    @Bean
    public CustomFilterSecurityInterceptor myFilterSecurityInterceptor() {
        CustomFilterSecurityInterceptor myFilterSecurityInterceptor = new CustomFilterSecurityInterceptor();
        myFilterSecurityInterceptor.setMyAccessDecisionManager(customAccessDecisionManager);
        return myFilterSecurityInterceptor;
    }


    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(customAuthenticationProvider);
    }

    /**
     * Web层面的配置，一般用来配置无需权限校验的路径，也可以在HttpSecurity中配置，但是在web.ignoring()中配置效率更高。
     * web.ignoring()是一个忽略的过滤器，而HttpSecurity中定义了一个过滤器链，即使permitAll()放行还是会走所有的过滤器，
     * 直到最后一个过滤器FilterSecurityInterceptor认定是可以放行的，才能访问。
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/test.png");
    }
}
