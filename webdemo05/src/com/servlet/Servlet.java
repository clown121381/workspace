package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person p = new Person();
		p.setUsername(req.getParameter("username"));
		p.setPassword(req.getParameter("password"));
		System.out.println(req.getParameter("username"));
		req.setAttribute("person", p);
		
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/result.jsp");
		rd.forward(req, resp);
	}
}
