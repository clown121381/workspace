package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = null;
		String password = null;
		if(req.getParameter("username") != null) {
			username = req.getParameter("username");
		}
		
		if(req.getParameter("password") != null) {
			password = req.getParameter("password");
		}
		
		if(username.equals("2017214213") && password.equals("qwer")) {
			
			Cookie c = new Cookie("user",username);
				c.setMaxAge(30*60);
				c.setPath("/login");
				resp.addCookie(c);
			RequestDispatcher rd = req.getRequestDispatcher("/jsp/ok.jsp");
			rd.forward(req, resp);
		} else {
			req.setAttribute("statement", "用户名或密码错误");
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.forward(req, resp);
		}
	}
}