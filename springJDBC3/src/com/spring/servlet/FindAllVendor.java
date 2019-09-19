package com.spring.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
 * Servlet implementation class FindAllVendor
 */
@WebServlet("/FindAllVendor")
public class FindAllVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ApplicationContext act = new ClassPathXmlApplicationContext("resource/spring.xml");
 	
    IService service = (IService)act.getBean("service");
 	@Override
 	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		List<Table_Vendor> li = service.findAllVendor();
 		req.setAttribute("vendor_li", li);
 		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
 		req.setAttribute("date2", date);
 		req.setAttribute("date1", date);
 		req.getRequestDispatcher("/view/BillAdd.jsp").forward(req, resp);
 	}
}
