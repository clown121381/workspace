package com.leo.demos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.leo.demos.util.DBUtil;

public class DeptDao {
	public Connection conn = null;
	//新增部门
	public int saveDept(String deptno,String dname,String loc) throws Exception {
		//0	设置操作结果标记
		int flag = 0;
					
		
		//1	定义需要使用的对象			
		
		PreparedStatement ps = null;
						
		//2	准备sql语句		String	
		String sql = " insert into dept (deptno,dname,loc) values(?,?,?)  ";				
						
		//3	处理异常			
						
					
		
						
		//5	创建PreparedStatement对象		Statement	
			ps = conn.prepareStatement(sql);
			//使用变量替换sql语句中的？			
			ps.setString(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
		//6	执行sql语句			
			flag = ps.executeUpdate();			
						
		//7	提交			
			
				
	
						
		//8	释放资源			
			ps.close();
			
			
						
		//9	返回操作结果标记			
		return flag;
	}
	

	
}
