package com.mqsyoung.jdbc;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * ��ȡ���ͷ����ݿ�����
 * @author lenovo
 *
 */


public class GetJdbc {
	
 	private static DataSource dataSource = new ComboPooledDataSource("webDataSource");
	
	/**
	 * ��ȡ���ݿ�����
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
	 * �ͷ����ݿ�����
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
