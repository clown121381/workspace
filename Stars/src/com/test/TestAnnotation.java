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
//��������
//		Star s = new Star();
//		s.setStarid(50);
//		s.setSname("star_50");
//		s.setAge(88);
//		s.setSalary(3800);
//		i.insertStar(s);
//���ݱ�Ų�ѯ
//		Star s = i.selectById(50);
//		System.out.println(s);
//����ָ�����ʷ�Χ��ѯ
//		List<Star> li = i.selectBySalary(300, 600);
//		System.out.println(li);
//��ѯ����׷�ߵ�����
//		Star s = i.selectByMaxSalary();
//		System.out.println(s);
		
//��ѯ�ܼ�¼��
		int count = i.selectCount();
		System.out.println(count);
//		session.commit();
		session.close();
		Mybatis_Util.closeSession();
	}
}
