package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.Idao.Idao;
import com.clazz.Clazz;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
		Idao i = session.getMapper(Idao.class);
		Clazz cl = i.selectClass(1);
//		Student stu = i.selectStudent(1);
		System.out.println(cl.getStudents());
		session.close();
	}
}
