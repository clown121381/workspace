package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.star.Star;

public class TestXml {
	
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(false);
//插入测试数据		
//		Star s = new Star();
//		for(int i = 0;i < 50;i ++)
//		{
//			s.setStarid(i);
//			s.setSname("star_"+i);
//			s.setAge(i*20);
//			s.setSalary(i*50);
//			session.insert("com.mapper.StarMapper.insertStar", s);
//		}
//		
//根据id查询	
//		Star s = session.selectOne("com.mapper.StarMapper.selectById", 5);
//		System.out.println(s);
//查询指定工资范围的明星
//		
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		map.put("salary1", 300);
//		map.put("salary2", 600);
//		List<Star> li = session.selectList("com.mapper.StarMapper.selectBySalary", map);
//		System.out.println(li);
//		
//查询工资最高的明星
		
//		Star s = session.selectOne("com.mapper.StarMapper.selectByMaxSalary");
//		System.out.println(s);
		
//查询一共多少条记录
		
		int count = session.selectOne("com.mapper.StarMapper.selectCount");
		System.out.println(count);
		session.commit();
		Mybatis_Util.closeSession();
	}
}
