package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcCountry {
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static final String USER = "scott";
	public static final String PASSWORD = "Oracle1234";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			st = conn.createStatement();
			rs = st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.print(rs.getString("empno")+" "+
								 rs.getString("ename")+" "+
								 rs.getString("job")+" "+
								 rs.getString("mgr")+" "+
								 rs.getString("hiredate").substring(0,10).replace("-","/")+" "+
								 rs.getString("sal")+" "+
								 rs.getString("comm")+" "+
								 rs.getString("deptno")+'\n');
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally
		{
			try {
				conn.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
