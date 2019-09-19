package com.leo.demos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.leo.demos.util.DBUtil;

public class EmpDao {
	//新增员工
	public Connection conn = null;
	public int saveEmp(String empno,String ename, String deptno) throws Exception{

		//0	设置操作结果标记
		int flag = 0;
					
		
		//1	定义需要使用的对象			
		//Connection conn = null;
		PreparedStatement ps = null;
						
		//2	准备sql语句		String	
		String sql = " insert into emp (empno,ename,deptno) values(?,?,?)  ";				
						
		
						
		//5	创建PreparedStatement对象		Statement	
			ps = conn.prepareStatement(sql);
			//使用变量替换sql语句中的？			
			ps.setString(1,empno );
			ps.setString(2,ename );
			ps.setString(3,deptno );
		//6	执行sql语句			
			flag = ps.executeUpdate();			
						
		//7	提交			
			
				
	
						
		//8	释放资源			
			ps.close();
			
			
						
		//9	返回操作结果标记			
		return flag;
	
	}
}
