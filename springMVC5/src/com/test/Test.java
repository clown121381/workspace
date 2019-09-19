package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("resource/spring.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) act.getBean("jdbcTemplate");
		System.out.println(jdbcTemplate);
	}
}
