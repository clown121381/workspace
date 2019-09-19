package com.spring.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Table_Vendor;
import com.spring.service.IService;

/**
 * Servlet implementation class FindAVendor
 */
@WebServlet("/FindAVendor")
public class FindAVendor extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ApplicationContext act = new ClassPathXmlApplicationContext("resource/spring.xml");
	IService service = (IService)act.getBean("service");
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String vendor_name = req.getParameter("vendor_name");
		if(vendor_name != null) {
			Table_Vendor vendor = service.findAVendorByVendorName(vendor_name);
			
		}
	}
}
