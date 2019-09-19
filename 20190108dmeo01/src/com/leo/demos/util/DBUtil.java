package com.leo.demos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	
	public static Connection getConnection() {
		//
		Connection conn = null;
		//        
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
		String user = "scott";
		String password = "tiger";
		//数据库驱动程序完全限定类名  
		String className ="oracle.jdbc.driver.OracleDriver";
		try{
			Class.forName(className);
			conn = DriverManager.getConnection(url, user, password);

			
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
	public static void close(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn){
		if(conn != null){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement ps){
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
