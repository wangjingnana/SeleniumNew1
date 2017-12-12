package utils;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class fujianmail {
	
//	public static void main(String[] args) {
//		fujianmail mail = new fujianmail();
//		mail.sendMailAttached("C:\\xuexi\\dasanshang\\Selenium\\eclipselizi\\chanzhi\\test-output.zip");
//	}
	
	public void sendMailAttached(){

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.setProperty("mail.user", "18713923868@163.com");
			props.setProperty("mail.password", "nannan1121");

		  
		   // 收件人电子邮箱
		   String to = "626231936@qq.com";

		   // 发件人电子邮箱
		   String from = "18713923868@163.com";

		   // 指定发送邮件的主机为 localhost
		   String host = "smtp.163.com";

		   // 获取系统属性
		   Properties properties = System.getProperties();

		   // 设置邮件服务器
		   properties.setProperty("mail.smtp.host", host);
		   properties.put("mail.smtp.auth", "true");

		   // 获取默认的 Session 对象。
		   Session session = Session.getDefaultInstance(properties,new Authenticator(){
		   public PasswordAuthentication getPasswordAuthentication()
		   {
		      return new PasswordAuthentication("18713923868@163.com", "nannan1121"); //发件人邮件用户名、密码
		   }
		   });

		   try{
		      // 创建默认的 MimeMessage 对象。
		      MimeMessage message = new MimeMessage(session);

		      // Set From: 头部头字段
		      message.setFrom(new InternetAddress(from));

		      // Set To: 头部头字段
		      message.addRecipient(Message.RecipientType.TO ,new InternetAddress(to));

		      // Set Subject: 头字段
		      message.setSubject("王静楠实训压缩包");

		      // 创建消息部分
		      BodyPart messageBodyPart = new MimeBodyPart();

		      // 消息
		      messageBodyPart.setText("下面是test-output压缩包。");
		     
		      // 创建多重消息
		      Multipart multipart = new MimeMultipart();

		      // 设置文本消息部分
		      multipart.addBodyPart(messageBodyPart);

		      // 附件部分
		      
			  CompressedFileUtil c = new CompressedFileUtil();
			  c.yasuo("C:\\xuexi\\dasanshang\\Selenium\\eclipselizi\\chanzhi\\test-output",
						"C:\\xuexi\\test-output1");
			
		      messageBodyPart = new MimeBodyPart();
		      String filename = "C:\\xuexi\\test-output1\\test-output.zip";
		      DataSource source = new FileDataSource(filename);
		      messageBodyPart.setDataHandler(new DataHandler(source));
		      messageBodyPart.setFileName(filename);
		      multipart.addBodyPart(messageBodyPart);

		      // 发送完整消息
		      message.setContent(multipart );

		      //   发送消息
		      Transport.send(message);
		      System.out.println("ok！");
		      
		   	}catch (MessagingException mex) 
		     {
		      mex.printStackTrace();
		     }
		}

}
