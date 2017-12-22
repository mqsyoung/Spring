package com.Demo;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author : mengqignsen
* @version 创建时间：2017年12月15日 上午9:26:23 
* 类说明 
*/
public class DataSourceUtill {
	/** 
	* @author : mengqignsen
	* @version 创建时间：2017年12月15日 上午9:26:23 
	* 说明 
	*/
	
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	 
	@Test
	public void getDataSource() throws SQLException{
		
		DataSource data = (DataSource) ioc.getBean("dataSource");
		
		System.out.println(data.getConnection());
		
	}
	
	
}
