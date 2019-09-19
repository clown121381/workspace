package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.Idao.Idao;
import com.star.Star;

public class TestAnnotation {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
		Idao i = session.getMapper(Idao.class);
//插入数据
//		Star s = new Star();
//		s.setStarid(50);
//		s.setSname("star_50");
//		s.setAge(88);
//		s.setSalary(3800);
//		i.insertStar(s);
//根据编号查询
//		Star s = i.selectById(50);
//		System.out.println(s);
//根据指定工资范围查询
//		List<Star> li = i.selectBySalary(300, 600);
//		System.out.println(li);
//查询工资追高的明星
//		Star s = i.selectByMaxSalary();
//		System.out.println(s);
		
//查询总记录数
		int count = i.selectCount();
		System.out.println(count);
//		session.commit();
		session.close();
		Mybatis_Util.closeSession();
	}
}
