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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = null;
		String password = null;
		if(req.getParameter("username") != null) {
			username = new String(req.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
		}
		
		if(req.getParameter("password") != null) {
			password = new String(req.getParameter("password").getBytes("ISO-8859-1"),"UTF-8");
		}
		
		String resource = "/WEB-INF/jsp/ok.jsp";
		if("2017214213".equals(username) && "qwer".equals(password)) {
			
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
		} else {
			req.setAttribute("state", "”√ªß√˚√‹¬Î¥ÌŒÛ");
			resource = "/index.jsp";
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(resource);
		rd.forward(req, resp);
	}
}
