package com.aufine.controller;

import com.aufine.bean.PermissionRoleBean;
import com.aufine.dao.TyreInfoDAO;
import com.aufine.service.PermissionInfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testWeb {
    Gson gson=new Gson();

    @Autowired
    TyreInfoDAO tyreInfoDAO;

    @Autowired
    PermissionInfoService permissionInfoService;

    @RequestMapping("/getInfo")
    public String getJson(int id){
        //取配置文件自定义值方式,用Environment 是防止乱码统一编码格式
        //System.out.println(env.getProperty("man"));
        return gson.toJson(tyreInfoDAO.selectByPrimaryKey(id));
    }

    @RequestMapping("/manager/testUrl")
    public String test1() {
        List<PermissionRoleBean> resources2 = permissionInfoService.getAllPermission();
        System.out.println(gson.toJson(resources2));
        return gson.toJson(resources2);
    }
}
