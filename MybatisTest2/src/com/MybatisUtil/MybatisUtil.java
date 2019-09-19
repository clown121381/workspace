package com.MybatisUtil;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSession sqlSession = null;
	private static InputStream in = null;
	private static SqlSessionFactory sqlSessionFactory = null;
	public static SqlSession getSqlSession(String resource) {
		in = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
	
	public static void closeSession() {
		sqlSession.close();
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
