package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCUtil {
	
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static final String USER = "scott";
	public static final String PWD = "Oracle1234";
	public static Connection conn = null;
	
	static {
		//加载驱动
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//获取链接
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static Connection getConn() {
		return conn;
	}
	//提交
	public static void commitResult() {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//关闭资源
	public static void close(Statement st,ResultSet rs) {
		
		try {
			if(st != null) {
				st.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(conn != null)
			{
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
