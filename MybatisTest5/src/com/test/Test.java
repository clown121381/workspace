package com.test;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.Idao.IPersonMapper;
import com.person.Person;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
		IPersonMapper i = session.getMapper(IPersonMapper.class);
		Person p = i.findPersonByID(1);
		System.out.println(p);
	}
}
