package com.aufine.controller;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.bean.PermissionRoleBean;
import com.aufine.dao.TyreInfoDAO;
import com.aufine.service.PermissionInfoService;
import com.aufine.service.UploadService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;

@RestController
public class testWeb {
    Gson gson=new Gson();

    @Autowired
    TyreInfoDAO tyreInfoDAO;

    @Autowired
    PermissionInfoService permissionInfoService;

    @Autowired
    UploadService uploadService;

    @Value("${prop.upload-folder}")
    private String UPLOAD_FOLDER;


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

    @RequestMapping("/upload")
    @CrossOrigin
    public String uploadFile(MultipartFile file){
        HashMap paramMap=new HashMap();
        paramMap.put("upload_folder",UPLOAD_FOLDER);
        paramMap.put("file",file);

        AjaxResponseBody reVo=new AjaxResponseBody();
        try {
            reVo=uploadService.uploadSimpleFile(paramMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.toJson(reVo);
    }
}
