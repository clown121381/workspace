package com.stu;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Test {
	public static void main(String[] args) {
		try {
			// ͨ��Configuration���һ��SessionFactory����
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			// ��һ��Session
			Session session = sf.openSession();
			// ��ʼһ������
			Transaction tx = session.beginTransaction();
			// ����һ��Student����
			Student stu = new Student();
			// ͨ��Student��setter�����ı���������
			// ע��student_id������������
			stu.setStudent_name("zhangsi");
			stu.setStudent_age(18);
			// ͨ��session��save()������Student���󱣴浽���ݿ���
			session.save(stu);
			// �ύ����
			tx.commit();
			// �رջỰ
			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
