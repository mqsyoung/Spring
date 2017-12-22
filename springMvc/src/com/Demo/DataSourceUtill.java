package com.Demo;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author : mengqignsen
* @version ����ʱ�䣺2017��12��15�� ����9:26:23 
* ��˵�� 
*/
public class DataSourceUtill {
	/** 
	* @author : mengqignsen
	* @version ����ʱ�䣺2017��12��15�� ����9:26:23 
	* ˵�� 
	*/
	
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	 
	@Test
	public void getDataSource() throws SQLException{
		
		DataSource data = (DataSource) ioc.getBean("dataSource");
		
		System.out.println(data.getConnection());
		
	}
	
	
}
