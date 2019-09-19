package com.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.JDBCUtil;

public class InsertDao<T> {
	public Connection conn = JDBCUtil.getConn();
	public PreparedStatement pst = null;
	public int insertDao(T element,String className) throws SQLException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> cl = Class.forName(className);
		
		Field[] fields = cl.getDeclaredFields();
		String sql = "insert into ? values(";
		pst = conn.prepareStatement(sql);
		
		for (int i = 0; i < fields.length; i++) {
			if("class java.lang.String".equals(fields[i].getType().toString()))
			{
				Method method = cl.getDeclaredMethod("get"+fields[i].getName(), String.class);
				//pst.setString(i+1, fields[i].get);
			}
			else if("class java.lang.Integer".equals(fields[i].getType().toString()))
			{
				
			}
		}
		
		return 0;
	}
}
