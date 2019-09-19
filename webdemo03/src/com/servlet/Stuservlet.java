package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Stuservlet
 */
@WebServlet("/Stuservlet")
public class Stuservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("stunum")+req.getParameter("stuname")+req.getParameter("stupwd"));
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/student.jsp");
		rd.forward(req, resp);
	}
}
