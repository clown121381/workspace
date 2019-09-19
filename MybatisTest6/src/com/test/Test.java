package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.Idao.Idao;
import com.person.Person;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
		Idao i = session.getMapper(Idao.class);
		List<Person> p = i.selectAllPerson();
		System.out.println(p);
	}
}
