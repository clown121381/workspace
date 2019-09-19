package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.jdbc.dao.JDBCDao;
import com.jdbc.dao.impl.JDBCDaoImpl;

public class Tes1 {
	JDBCDao jdao = new JDBCDaoImpl();
	String tableName = "stu";
	@Test
	public void createTable() {
		jdao.createTable(tableName);
	}
	@Test
	public void saveData() {
		for(int i = 0;i < 100 ;i ++)
		{
			Student stu = new Student(i,"zhang"+i,(i*3));
			jdao.saveData(tableName, stu);
		}
	}	
	@Test
	public void updateData() {
		Student stu = new Student(1,"zhangsi",89);
		jdao.updateData(tableName, stu);
	}
	@Test
	public void deleteStu() {
		for (int i = 0; i < 100; i++) {
			jdao.deleteData(tableName, i);
		}
	}
	@Test 
	public void searchAllStu()
	{
		List<Student> list = jdao.searchAllStu(tableName);
		int i = 0;
		while(i < list.size()) {
			System.out.println(list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i++).getAge());
		}
	}
	@Test 
	public void searchAStu()
	{
		Student stu = jdao.searchAStu(tableName,56);
		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
	}
	@Test
	public void closeDateBase() {
		jdao.closeDataBase();
	}
}
