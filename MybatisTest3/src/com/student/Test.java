package com.student;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
		StuMapper map = session.getMapper(StuMapper.class);
		Student stu = map.selectAStu(2);
		List<Student> li = map.selectAllStu();
		int res = map.deleteStu(3);
		Student stu1 = new Student();
		stu1.setId(12);
		stu1.setName("ะกิý");
		stu1.setAge(13);
		int a = map.updateStu(stu1);
		System.out.println(a);
	}
}
