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

		  
		   // �ռ��˵�������
		   String to = "626231936@qq.com";

		   // �����˵�������
		   String from = "18713923868@163.com";

		   // ָ�������ʼ�������Ϊ localhost
		   String host = "smtp.163.com";

		   // ��ȡϵͳ����
		   Properties properties = System.getProperties();

		   // �����ʼ�������
		   properties.setProperty("mail.smtp.host", host);
		   properties.put("mail.smtp.auth", "true");

		   // ��ȡĬ�ϵ� Session ����
		   Session session = Session.getDefaultInstance(properties,new Authenticator(){
		   public PasswordAuthentication getPasswordAuthentication()
		   {
		      return new PasswordAuthentication("18713923868@163.com", "nannan1121"); //�������ʼ��û���������
		   }
		   });

		   try{
		      // ����Ĭ�ϵ� MimeMessage ����
		      MimeMessage message = new MimeMessage(session);

		      // Set From: ͷ��ͷ�ֶ�
		      message.setFrom(new InternetAddress(from));

		      // Set To: ͷ��ͷ�ֶ�
		      message.addRecipient(Message.RecipientType.TO ,new InternetAddress(to));

		      // Set Subject: ͷ�ֶ�
		      message.setSubject("�����ʵѵѹ����");

		      // ������Ϣ����
		      BodyPart messageBodyPart = new MimeBodyPart();

		      // ��Ϣ
		      messageBodyPart.setText("������test-outputѹ������");
		     
		      // ����������Ϣ
		      Multipart multipart = new MimeMultipart();

		      // �����ı���Ϣ����
		      multipart.addBodyPart(messageBodyPart);

		      // ��������
		      
			  CompressedFileUtil c = new CompressedFileUtil();
			  c.yasuo("C:\\xuexi\\dasanshang\\Selenium\\eclipselizi\\chanzhi\\test-output",
						"C:\\xuexi\\test-output1");
			
		      messageBodyPart = new MimeBodyPart();
		      String filename = "C:\\xuexi\\test-output1\\test-output.zip";
		      DataSource source = new FileDataSource(filename);
		      messageBodyPart.setDataHandler(new DataHandler(source));
		      messageBodyPart.setFileName(filename);
		      multipart.addBodyPart(messageBodyPart);

		      // ����������Ϣ
		      message.setContent(multipart );

		      //   ������Ϣ
		      Transport.send(message);
		      System.out.println("ok��");
		      
		   	}catch (MessagingException mex) 
		     {
		      mex.printStackTrace();
		     }
		}

}
