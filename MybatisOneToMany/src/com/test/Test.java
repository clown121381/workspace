package com.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.clazz.Clazz;
import com.student.Student;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
//		Student s = session.selectOne("com.sql.sqlMapper.test", 4);
//      Clazz cl = session.selectOne("com.sql.sqlMapper.test1"1);
		Student stu = new Student();
		Clazz cl = new Clazz();
		stu.setId(8);
		stu.setName("student_H");
		
		cl.setId(3);
		cl.setName("chinese");

		List<Student> li = new ArrayList<Student>();
		li.add(stu);
		stu.setClazz(cl);
		
		//int s = session.insert("com.sql.sqlMapper.insertClass", cl);
		int s1 = session.insert("com.sql.sqlMapper.insertStudent", stu);
		System.out.println(s1);
		session.commit();
		session.close();
	}
}
