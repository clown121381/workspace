package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.spring.Person;

public class Test {
	public static void main(String[] args) {
		//1.获取spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		 //2.由配置文件返回对象
		 Person p = (Person)context.getBean("person");
		 System.out.println(p);
	}
}
