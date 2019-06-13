package com.aufine.service.impl;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.dao.AttachmentInfoDAO;
import com.aufine.entity.AttachmentInfo;
import com.aufine.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    AttachmentInfoDAO attachmentInfoDAO;


    @Override
    @Transactional
    public AjaxResponseBody uploadSimpleFile(HashMap<String, Object> prarmMap) throws Exception{
        AjaxResponseBody returnStr=new AjaxResponseBody();
            if(prarmMap.get("upload_folder")!=null&&prarmMap.get("file")!=null){
                String upload_folder=prarmMap.get("upload_folder").toString();
                MultipartFile file = (MultipartFile)prarmMap.get("file");
                if (Objects.isNull(file) || file.isEmpty()) {
                    returnStr.setStatus("500");
                    returnStr.setMsg("请选择文件上传!");
                }else{
                    byte[] bytes = file.getBytes();
                    Path path = Paths.get(upload_folder + file.getOriginalFilename());
                    //如果没有files文件夹，则创建
                    if (!Files.isWritable(path)) {
                        Files.createDirectories(Paths.get(upload_folder));
                    }
                    //先写入数据库，成功后再上传文件到服务器
                    System.out.println("增加数据库信息");
                    AttachmentInfo attachmentInfo=new AttachmentInfo();
                    //附件名称
                    attachmentInfo.setAttachmentname(file.getName());
                    //附件大小
                    attachmentInfo.setAttachmentsize(file.getSize()+"");
                    //附件绝对路径
                    attachmentInfo.setAttachmentrelativepath(path.toString());
                    //附件后缀名
                    attachmentInfo.setAttachmentsuffixname(file.getName().substring(file.getName().lastIndexOf(".") + 1));
                    //创建时间
                    attachmentInfo.setCreatetime(new Date());
                    //创建人(当前登录人信息ID)
                    attachmentInfo.setCreateid(1);
                    //创建人姓名
                    attachmentInfo.setCreatename("admin");
                    attachmentInfoDAO.insertSelective(attachmentInfo);

                    //文件写入指定路径
                    Files.write(path, bytes);
                    returnStr.setStatus("200");
                    returnStr.setMsg("文件上传成功!");
                }
            }else{
                returnStr.setStatus("500");
                returnStr.setMsg("请选择文件上传!");
            }
        return returnStr;
    }
}
