package com.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.MybatisUtil.MybatisUtil;
import com.student.Student;

public class Test {
	public static void main(String[] args) {
		SqlSession session = MybatisUtil.getSqlSession("config.xml");
//		Student stu = session.selectOne("com.sql.sqlMapper.getStu",1);
//		stu1.setId(102);
//		stu1.setName("ะกอ๕");
//		stu1.setAge(102);
//		session.commit();
		
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("id", 0);
		map.put("age", 0);
		Student stu = session.selectOne("com.sql.sqlMapper.getStu",map);
		System.out.println(stu);
	}
}
