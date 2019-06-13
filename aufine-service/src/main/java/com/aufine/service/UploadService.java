package com.aufine.service;

import com.aufine.bean.AjaxResponseBody;

import java.util.HashMap;

public interface UploadService {
    /********************************************************************
    *   参数包括(类型) 备注：
    *   upload_folder(String)                   上传文件保存地址
    *   file(MultipartFile)                     上传文件
    *   isLimit(boolean)                        是否开启限制
    *   type[](String[])                        限制类型,isLimit为true才生效
    *   返回值：
    *   AjaxResponseBody 具体信息见返回值，成功会返回文件信息主键ID及图片地址
    ********************************************************************/
    AjaxResponseBody uploadSimpleFile(HashMap<String,Object> prarmMap) throws Exception;
}
