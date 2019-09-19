package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Table_Vendor;
import com.spring.dao.BillDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("resource/spring.xml");
		BillDao billDao = (BillDao)act.getBean("billDao");
		Table_Vendor ven = billDao.findAVendorByVendorName("jo");
		System.out.println(ven);
	}
}
