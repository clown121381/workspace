package com.jdbc.dao;

import java.util.List;

import com.jdbc.test.Student;

public interface JDBCDao {
	
	public abstract void createTable(String tableName);
	
	public abstract void saveData(String tableName, Student stu);
	
	public abstract void updateData(String tableName,Student stu);
	
	public abstract void deleteData(String tableName,int id);
	
	public abstract Student searchAStu(String tableName,int id);
	
	public abstract List<Student> searchAllStu(String tableName);
	public abstract void closeDataBase();
}	
