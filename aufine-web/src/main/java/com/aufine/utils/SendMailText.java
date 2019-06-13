package com.aufine.utils;
import com.aufine.entity.CustomerInfo;
import com.aufine.entity.EmailSetting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;

@Component

public class SendMailText {

    //发件人地址
    //public static String senderAddress = "15711450175@163.com";
    //收件人地址
    //public static String recipientAddress = "1497651347@qq.com";
    //发件人账户名
   // public static String senderAccount = "15711450175";
    //发件人账户密码
    //public static String senderPassword = "";

    /**
     *  发送邮件
     * @param emailSetting  查询发送邮件的基本信息，比如发件人，授权码。。
     * @param customerInfo  将客户填写的数据插入到数据库
     */
    public static void SendEmail(EmailSetting emailSetting, CustomerInfo customerInfo) {
        //1、连接邮件服务器的参数配置
        Properties props = new Properties();
        //设置用户的认证方式
        props.setProperty("mail.smtp.auth", "true");
        //设置传输协议
        props.setProperty("mail.transport.protocol", "smtp");
        //设置发件人的SMTP服务器地址
        props.setProperty("mail.smtp.host", "smtp.163.com");
        //2、创建定义整个应用程序所需的环境信息的 Session 对象
        Session session = Session.getInstance(props);
        //设置调试信息在控制台打印出来
        session.setDebug(true);
        //3、创建邮件的实例对象
        try {
            Message msg = getMimeMessage(session,emailSetting,customerInfo);
            //4、根据session对象获取邮件传输对象Transport
            Transport transport = session.getTransport();
            //设置发件人的账户名和密码
            transport.connect(emailSetting.getSenderaccount(), emailSetting.getSenderpassword());
            //发送邮件，并发送到所有收件人地址，message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
            transport.sendMessage(msg,msg.getAllRecipients());

            //如果只想发送给指定的人，可以如下写法
            //transport.sendMessage(msg, new Address[]{new InternetAddress("xxx@qq.com")});

            //5、关闭邮件连接
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得创建一封邮件的实例对象
     * @param session
     * @return
     * @throws MessagingException
     * @throws AddressException
     */
    public static MimeMessage getMimeMessage(Session session,EmailSetting emailSetting,CustomerInfo customerInfo) throws Exception{
        //创建一封邮件的实例对象
        MimeMessage msg = new MimeMessage(session);


        //设置发件人地址
        msg.setFrom(new InternetAddress(emailSetting.getSenderaddress()));
        /**
         * 设置收件人地址（可以增加多个收件人、抄送、密送），即下面这一行代码书写多行
         * MimeMessage.RecipientType.TO:发送
         * MimeMessage.RecipientType.CC：抄送
         * MimeMessage.RecipientType.BCC：密送
         */
        msg.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(customerInfo.getEmail()));
        //设置邮件主题
        msg.setSubject("邮件主题","UTF-8");
        //设置邮件正文

        //msg.setContent("121212！", "text/html;charset=UTF-8");

        MimeMultipart mp = new MimeMultipart();
        MimeBodyPart mbp1= new MimeBodyPart();
        String htmlText = "<p style=\"font-size:30px;color:orange\"> This is formatted</p>"+
                "<font size =\"115\" face=\"arial\" >This paragraph is in Arial, size 115</font>";
        mbp1.setContent(htmlText,"text/html");
        mp.addBodyPart(mbp1);
        msg.setContent(mp);

        //设置邮件的发送时间,默认立即发送
        msg.setSentDate(new Date());

        return msg;
    }

}
