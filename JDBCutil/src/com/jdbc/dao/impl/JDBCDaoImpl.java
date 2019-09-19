package com.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.dao.JDBCDao;
import com.jdbc.test.Student;
import com.jdbc.util.JDBCUitl;
public class JDBCDaoImpl implements JDBCDao{

	@Override
	public void createTable(String tableName) {
		try {
			Statement st = JDBCUitl.getStatement();
			String sql = "create table "+tableName+" (id number(3),name varchar2(20),age number(3))";
			st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void saveData(String tableName, Student stu) {
		try {
			Statement st = JDBCUitl.getStatement();
			String sql = "insert into "+tableName+" values("+stu.getId()+",'"+stu.getName()+"',"+stu.getAge()+")";
			st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateData(String tableName, Student stu) {
		try {
			Statement st = JDBCUitl.getStatement();
			String sql = "update "+tableName+" set name = '"+stu.getName()+"'  where id = "+stu.getId()+"";
			String sql1 = "update "+tableName+" set age = '"+stu.getAge()+"'  where id = "+stu.getId()+"";
			st.executeQuery(sql);
			st.executeQuery(sql1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteData(String tableName, int id) {
		try {
			Statement st = JDBCUitl.getStatement();
			String sql = "delete from "+tableName+" where id = "+id+"";
			st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student searchAStu(String tableName, int id) {
		try {
			Statement st = JDBCUitl.getStatement();
			String sql = "select * from "+tableName+" where id = "+id+"";
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				Student stu = new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"));
				return stu;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> searchAllStu(String tableName) {
		ResultSet rs = null;
		try {
			Statement st = JDBCUitl.getStatement();
			String sql = "select * from "+tableName+"";
			rs = st.executeQuery(sql);
			List<Student> list = new ArrayList<Student>();
			while(rs.next()) {
				Student stu = new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"));
				list.add(stu);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally
		{
			if(rs != null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public void closeDataBase() {
		JDBCUitl.close();
	}
	
}
