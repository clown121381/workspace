package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		if("2017214213".equals(username) && "qwer".equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("user", username);
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/ok.jsp");
			rd.forward(req, resp);
		}
	}
}
