package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Customer;
import com.spring.bean.Person;

public class Test {
	public static void main(String[] args) {
		ApplicationContext axt = new ClassPathXmlApplicationContext("config/Bean.xml");
	
		Person man = (Person)axt.getBean("man");
		man.SayHello();
		
		Person woman = (Person)axt.getBean("woman");
		woman.SayHello();
		
		Person xiaoming = (Person)axt.getBean("con_man");
		xiaoming.SayHello();
		
		Customer c1 = (Customer)axt.getBean("p1");
		c1.getPerson().SayHello();
		String [] li = c1.getOrder();
		System.out.println(li.length);
		
		Customer c2 = (Customer)axt.getBean("auto_man");
		System.out.println(c2.getMan());
	}
}
