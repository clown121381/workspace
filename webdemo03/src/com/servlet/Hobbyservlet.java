package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.corba.RequestImpl;

/**
 * Servlet implementation class Hobbyservlet
 */
@WebServlet("/Hobbyservlet")
public class Hobbyservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] hobbys = req.getParameterValues("hobby");
		if(hobbys != null) {
			for(int i = 0;i < hobbys.length;i ++)
				System.out.println(hobbys[i]);
		} else {
			System.out.println("Ã»ÓÐ°®ºÃ");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/hobby.jsp");
		rd.forward(req, resp);
	}
}
