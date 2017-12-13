package com.mqsyoung.util;

import java.sql.Connection;

import org.junit.Test;

import com.mqsyoung.jdbc.GetJdbc;

public class JdbcUtil {

	
 	  @Test
	  public void testGetJdbc(){
		  Connection conn = null;
		  try {
			  conn =GetJdbc.getConection();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		  
		  if(conn != null){
			  
			  System.out.println(conn);
		  }else{
			  System.out.println("不好意识，没有获取到数据源……");
		  }
		  
		  
	  } 
}
