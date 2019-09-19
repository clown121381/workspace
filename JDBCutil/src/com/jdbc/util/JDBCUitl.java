package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUitl {
	private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static String USER = "scott";
	private static String PASSWORD = "Oracle1234";
	private static Connection conn = null;

	private static Statement st = null;
	static {
		try { 
			//1.加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.获取连接
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			st = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Statement getStatement() {
		return st;
	}
	public static void close() {
		if(conn != null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st != null)
		{
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
