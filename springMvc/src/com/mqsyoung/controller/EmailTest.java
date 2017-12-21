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
* ��˵�� 
*/
public class EmailTest {
 
	
	//�������������
	private static String KEY_SMTP = "";
	private static String VALUE_SMTP = "";
	
	//��������֤
	private static String KEY_PROPS = "mail.smtp.auth";
	private static boolean VALUE_PROPS = true;
	
	//���÷��������䣬�û���������
	private String SEND_USER="";
	private String SEND_UNAME="";
	private String SEND_PASSWORD="";
	
	
	//�����Ự
	
	private MimeMessage message;
	
	private Session session;
			
	
	//��ʼ������
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
				 //�ʼ�������
				 InternetAddress from = new InternetAddress(SEND_UNAME);
				 
				 	message.setFrom(from);
				
				 	//�ռ���
				InternetAddress  to = new InternetAddress(receiveUser);
			
				message.setRecipient(Message.RecipientType.TO, to);
				 	
				//�ʼ�����
				message.setSubject(headName);
				//�����ʼ����ݿ����Ǵ��ı��� �� text/html
				String  context = sendHtml.toString();
				message.setContent(context, "text/html;charset=GBK");
				//����
				message.saveChanges();
				
				//������Ϣ
				Transport transport =  session.getTransport("stmp");
				
				transport.connect(VALUE_SMTP, SEND_USER, SEND_PASSWORD);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
			
	
}
