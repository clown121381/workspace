package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Student;
import com.spring.dao.StudentDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("resource/spring.xml");
		StudentDao dao = (StudentDao)act.getBean("studentDaoImpl");
		//dao.insertStudent(new Student(100,"marry","woman",23));
		
		//dao.updateStudent(new Student(100,"marry","man",23));
		
		//dao.deleteStudent(100);
		
		System.out.println(dao.findById(117));
		System.out.println(dao.findAll());
	}
}
