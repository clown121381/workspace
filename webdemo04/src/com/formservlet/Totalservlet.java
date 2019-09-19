package com.formservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Totalservlet
 */
@WebServlet("/Totalservlet")
public class Totalservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse respo) throws ServletException, IOException {
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("password"));
		System.out.println(req.getParameter("hobby"));
	
		String hobbys[] = req.getParameterValues("hobbys");
		if(hobbys != null) {
			for(String h : hobbys)
			{
				System.out.println(h);
			}
		}
		
		System.out.println(req.getParameter("hobby1"));
		String[] hobby2 = req.getParameterValues("hobby2");
		
		if(hobbys != null) {
			for(String h : hobby2)
			{
				System.out.println(h);
			}
		}
		
		System.out.println(req.getParameter("text"));
	}

}
