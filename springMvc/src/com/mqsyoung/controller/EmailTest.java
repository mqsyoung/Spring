package com.mqsyoung.controller;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.omg.CosNaming.NamingContextExtPackage.InvalidAddress;

/** 
* @author : mengqignsen
* 类说明 
*/
public class EmailTest {
 
	
	//设置邮箱服务器
	private static String KEY_SMTP = "";
	private static String VALUE_SMTP = "";
	
	//服务器验证
	private static String KEY_PROPS = "mail.smtp.auth";
	private static boolean VALUE_PROPS = true;
	
	//设置发送者邮箱，用户名，密码
	private String SEND_USER="";
	private String SEND_UNAME="";
	private String SEND_PASSWORD="";
	
	
	//建立会话
	
	private MimeMessage message;
	
	private Session session;
			
	
	//初始化参数
	public EmailTest(){
		
		Properties pro = System.getProperties();
		pro.setProperty(KEY_SMTP, VALUE_SMTP);
		pro.setProperty(KEY_PROPS, "true");
		session = Session.getDefaultInstance(pro, new Authenticator() {
			protected  PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(SEND_USER,SEND_PASSWORD);
			}
		});
		session.setDebug(true);
		message = new MimeMessage(session);
	 }
	
	
		public void doSendEmail (String headName  , String sendHtml , String receiveUser){
				
			
			 try {
				 //邮件发送者
				 InternetAddress from = new InternetAddress(SEND_UNAME);
				 
				 	message.setFrom(from);
				
				 	//收件人
				InternetAddress  to = new InternetAddress(receiveUser);
			
				message.setRecipient(Message.RecipientType.TO, to);
				 	
				//邮件标题
				message.setSubject(headName);
				//设置邮件内容可以是村文本的 ， text/html
				String  context = sendHtml.toString();
				message.setContent(context, "text/html;charset=GBK");
				//保存
				message.saveChanges();
				
				//发送消息
				Transport transport =  session.getTransport("stmp");
				
				transport.connect(VALUE_SMTP, SEND_USER, SEND_PASSWORD);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
			
	
}
