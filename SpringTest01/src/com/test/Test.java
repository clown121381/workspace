package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.spring.Person;

public class Test {
	public static void main(String[] args) {
		//1.��ȡspring�����ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		 //2.�������ļ����ض���
		 Person p = (Person)context.getBean("person");
		 System.out.println(p);
	}
}
