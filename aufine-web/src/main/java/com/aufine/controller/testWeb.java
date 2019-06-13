package com.aufine.controller;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.bean.PermissionRoleBean;
import com.aufine.dao.TyreInfoDAO;
import com.aufine.service.PermissionInfoService;
import com.aufine.service.UploadService;
import com.aufine.util.PrintWriterUtil;
import com.google.gson.Gson;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Api(value = "pet")
@RestController
@RequestMapping("/testWeb")
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

    @ApiOperation(value="测试API",notes = "hello,springfox,api")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID",paramType = "path",dataType = "int"),
            @ApiImplicitParam(name = "userName",value = "用户名称",paramType = "form",dataType = "string")
})
    @RequestMapping("/manager/testUrl")
    public String test1() {
        List<PermissionRoleBean> resources2 = permissionInfoService.getAllPermission();
        System.out.println(gson.toJson(resources2));
        return gson.toJson(resources2);
    }

    @RequestMapping("/upload")
    public String uploadFile(MultipartFile file){
        HashMap paramMap=new HashMap();
        paramMap.put("upload_folder",UPLOAD_FOLDER);
        paramMap.put("file",file);
        //限制上传文件格式
        String[] type={"png","bmn"};
        paramMap.put("isLimit",true);
        paramMap.put("type",type);
        AjaxResponseBody reVo=new AjaxResponseBody();
        try {
            reVo=uploadService.uploadSimpleFile(paramMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.toJson(reVo);
    }

    @RequestMapping("/download")
    public void download(HttpServletResponse response,HttpServletRequest request,int id){
        HashMap paramMap=new HashMap();
        paramMap.put("upload_folder",UPLOAD_FOLDER);
        paramMap.put("id",id);
        AjaxResponseBody reVo=new AjaxResponseBody();
        try {
            uploadService.download(response,request,paramMap);
        } catch (Exception e) {
            //e.printStackTrace();
        }
        reVo.setMsg(request.getAttribute("msg")==null?"":request.getAttribute("msg").toString());
        reVo.setStatus(request.getAttribute("status")==null?"":request.getAttribute("status").toString());
        PrintWriterUtil.returnStr(response,reVo);
    }
}
