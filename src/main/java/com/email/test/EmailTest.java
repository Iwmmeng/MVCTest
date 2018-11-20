package com.email.test;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author wangmeng
 * @date 18/11/20
 */
public class EmailTest {
    public static void main(String [] args)
    {
        // 收件人电子邮箱
        String to = "wangmeng8@xiaomi.com";

        // 发件人电子邮箱
        String from = "834638005@gmail.com";

        Properties properties = new Properties();
                properties.put("mail.transport.protocol", "smtp");// 连接协议
                 properties.put("mail.smtp.host", "smtp.xiaomi.com");// 主机名
                 properties.put("mail.smtp.port", 465);// 端口号
                 properties.put("mail.smtp.auth", "true");
                 properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
                 properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息

        // 获取系统属性
//        Properties properties = System.getProperties();


        // 设置邮件服务器
//        properties.setProperty("mail.smtp.host", "smtp.xiaomi.com'");

        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties);

        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("This is the Subject Line!");

            // 设置消息体
            message.setText("This is actual message");

            // 得到邮差对象
                     Transport transport = session.getTransport();
                     // 连接自己的邮箱账户
                     transport.connect("834638005@qq.com", "wangmeng127821");// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码
                     // 发送邮件
                     transport.sendMessage(message, message.getAllRecipients());
                     transport.close();
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
