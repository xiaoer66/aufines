package com.aufine.controller;

import com.aufine.service.PermissionInfoService;
import com.aufine.bean.PermissionRoleBean;
import com.aufine.dao.PermissionInfoDAO;
import com.aufine.dao.TyreInfoDAO;
import com.google.gson.Gson;
import com.aufine.util.RedisUtil;
import com.aufine.util.common.ReleasePaths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class testDemo {

    Gson gson=new Gson();

    @Autowired
    TyreInfoDAO tyreInfoDAO;
    @Autowired
    PermissionInfoDAO permissionInfoDAO;
    @Autowired
    PermissionInfoService permissionInfoService;
    //@Autowired
    //Environment env;
    @Autowired
    ReleasePaths releasePaths;

    @RequestMapping("getInfo")
    public String getInfo(int id){
        //取配置文件自定义值方式,用Environment 是防止乱码统一编码格式
        //System.out.println(env.getProperty("man"));
        System.out.println(releasePaths.getIgnoringPaths());
        return gson.toJson(tyreInfoDAO.selectByPrimaryKey(id));
    }

    @RequestMapping("/hello")
    public String hello() {
        return RedisUtil.get("test02").toString();
    }

    @RequestMapping("/manager/testUrl")
    public String test1() {
        List<PermissionRoleBean> resources2 = permissionInfoService.getAllPermission();
        System.out.println(gson.toJson(resources2));
        return gson.toJson(resources2);
    }

    @RequestMapping("/manager/testUrl3")
    public String test2() {
        RedisUtil.set("test02","test02访问了");
        return "test2";
    }
}
