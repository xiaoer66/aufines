package com.aufine.service.impl;

import com.aufine.bean.AjaxResponseBody;
import com.aufine.dao.AttachmentInfoDAO;
import com.aufine.entity.AttachmentInfo;
import com.aufine.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
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
                String fileName=file.getResource().getFilename();
                //根据参数isLimit 拦截文件上传属性
                if(prarmMap.get("isLimit")!=null
                        &&(boolean)prarmMap.get("isLimit")
                        &&prarmMap.get("type")!=null){
                    String[] types=(String[]) prarmMap.get("type");
                    boolean isOk=true;
                    for (String type:types){
                        if(type.equals(fileName.substring(fileName.lastIndexOf(".") + 1))){
                            isOk=false;
                        }
                    }
                    if(isOk){
                        returnStr.setStatus("403");
                        returnStr.setMsg("上传文件类型受限!");
                        return returnStr;
                    }
                }
                byte[] bytes = file.getBytes();
                //获取当前数据库附件表最大ID
                int nowMaxFileId=attachmentInfoDAO.getMaxAttachmentID();
                Path path = Paths.get(upload_folder + nowMaxFileId + "_" + file.getOriginalFilename());
                //如果没有files文件夹，则创建
                if (!Files.isWritable(path)) {
                    Files.createDirectories(Paths.get(upload_folder));
                }
                //先写入数据库，成功后再上传文件到服务器
                AttachmentInfo attachmentInfo=new AttachmentInfo();
                //附件原名称
                attachmentInfo.setAttachmentoldname(fileName);
                //附件现名称
                attachmentInfo.setAttachmentnewname(nowMaxFileId+"_"+fileName);
                //附件大小
                attachmentInfo.setAttachmentsize(file.getSize()+"");
                //附件绝对路径
                attachmentInfo.setAttachmentrelativepath(path.toString());
                //附件后缀名
                attachmentInfo.setAttachmentsuffixname(fileName.substring(fileName.lastIndexOf(".") + 1));
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
                HashMap<String,Object> reMap=new HashMap<>();
                reMap.put("attachmentID",attachmentInfo.getAttachmentid());
                returnStr.setResult(reMap);
            }
        }else{
            returnStr.setStatus("500");
            returnStr.setMsg("请选择文件上传!");
        }
        return returnStr;
    }

    @Override
    public void download(HttpServletResponse response,HttpServletRequest request,HashMap<String, Object> prarmMap) throws Exception {
        //取出prarm中参数信息
        //文件主键ID
        String id=prarmMap.get("id").toString();
        //上传的文件都是保存在upload_folder参数目录下的子目录当中
        String upload_folder=prarmMap.get("upload_folder").toString();
        //根据文件信息ID查询数据库中文件信息
        AttachmentInfo attachmentInfo=attachmentInfoDAO.selectByPrimaryKey(Integer.parseInt(id));
        if(attachmentInfo!=null){
            //得到要下载的文件名
            String fileName = URLDecoder.decode(attachmentInfo.getAttachmentnewname(),"utf-8");
            //得到要下载的文件
            File file = new File(upload_folder + "\\" + fileName);
            //如果文件不存在
            if(!file.exists()){
                //文件不存在返回结果
                request.setAttribute("msg","服务端存储未查询到此文件!");
                request.setAttribute("status","500");
            }
            //处理文件名
            String realname = fileName.substring(fileName.indexOf("_")+1);
            //设置响应头，控制浏览器下载该文件
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
            //读取要下载的文件，保存到文件输入流
            FileInputStream in = new FileInputStream(upload_folder + "\\" + fileName);
            //创建输出流
            OutputStream out = response.getOutputStream();
            //创建缓冲区
            byte buffer[] = new byte[1024];
            int len = 0;
            //循环将输入流中的内容读取到缓冲区当中
            while((len=in.read(buffer))>0){
                //输出缓冲区的内容到浏览器，实现文件下载
                out.write(buffer, 0, len);
            }
            //关闭文件输入流
            in.close();
            //关闭输出流
            out.close();
        }else{
            //数据库中未查询到相关文件
            request.setAttribute("msg","服务端数据库中未查询到此文件!");
            request.setAttribute("status","500");
        }
    }
}
