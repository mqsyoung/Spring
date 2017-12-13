package com.mqsyoung.jdbc;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * 获取和释放数据库连接
 * @author lenovo
 *
 */


public class GetJdbc {
	
 	private static DataSource dataSource = new ComboPooledDataSource("webDataSource");
	
	/**
	 * 获取数据库链接
	 * @return
	 */
	 	public static Connection getConection(){
		
		Connection conn =null;
		
		try {
			conn = dataSource.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return conn;
	}
	 
	/**
	 * 释放数据库连接
	 * @param conn
	 */
	public static void releaseConection(Connection conn){ 
		
		if(conn != null){
			try {
				
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	 }
	
	
	
	
	
}
