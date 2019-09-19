package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.message.Message;

import MybatisUtil.Mybatis_Util;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(true);
		
		System.out.println();
	}
}
