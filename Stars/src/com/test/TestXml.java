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
//�����������		
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
//����id��ѯ	
//		Star s = session.selectOne("com.mapper.StarMapper.selectById", 5);
//		System.out.println(s);
//��ѯָ�����ʷ�Χ������
//		
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		map.put("salary1", 300);
//		map.put("salary2", 600);
//		List<Star> li = session.selectList("com.mapper.StarMapper.selectBySalary", map);
//		System.out.println(li);
//		
//��ѯ������ߵ�����
		
//		Star s = session.selectOne("com.mapper.StarMapper.selectByMaxSalary");
//		System.out.println(s);
		
//��ѯһ����������¼
		
		int count = session.selectOne("com.mapper.StarMapper.selectCount");
		System.out.println(count);
		session.commit();
		Mybatis_Util.closeSession();
	}
}
