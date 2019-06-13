package com.aufine.securityconfig;

import com.aufine.bean.AjaxResponseBody;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 无权限操作类
 */
@Component
public class CustomAuthenticationAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
        AjaxResponseBody ajaxResponseBody=new AjaxResponseBody();
        ajaxResponseBody.setStatus("403");
        ajaxResponseBody.setMsg("您无权限操作!");
        PrintWriterUtil.returnStr(httpServletResponse,ajaxResponseBody);
    }
}
