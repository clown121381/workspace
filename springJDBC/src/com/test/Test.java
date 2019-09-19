package com.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.dao.StuDao;
public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("resource/spring.xml"); 
		DataSource ds = (DataSource)act.getBean("datasource");
		System.out.println(ds);
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate)act.getBean("jdbcTemplate");
		System.out.println(jdbcTemplate);
		
		StuDao stuDao = (StuDao)act.getBean("stuDao");
		System.out.println(stuDao);
		
		System.out.println(stuDao.getJdbcTemplate());
	}
}
