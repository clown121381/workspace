package com.test;

import java.sql.SQLException;

import com.dao.InsertDao;
import com.element.Student;

public class Test {
	static InsertDao<Student> city = new InsertDao<Student>();
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStu_age(10);
		stu.setStu_id("2017");
		stu.setStu_name("ะกอ๕");
		try {
			try {
				city.insertDao(stu, "com.element.Student");
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
