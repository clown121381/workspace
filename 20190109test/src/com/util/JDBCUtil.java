package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class JDBCUtil {
	public static Connection conn = null;
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static String user = "scott";
	public static String pwd = "Oracle1234";
	static {
		try {
			//��������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//��ȡ����
			conn = DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//��ȡ��������
	@Test
	public static Connection getConn() {		
		return conn;
	}
	
	
}
