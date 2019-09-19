package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Country;
import com.service.IService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("com/config/spring.xml");
		IService iService = (IService)act.getBean("serviceImpl");
		Country coun = new Country();
		coun.setId(5);
		coun.setName("朝鲜");
		iService.addService(coun);
	}
}
