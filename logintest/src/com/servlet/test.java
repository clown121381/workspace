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
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		String username = (String)session.getAttribute("username");
		String resource = "/WEB-INF/jsp/ok2.jsp";
		if(username == null) {
			resource = "/index.jsp";
			req.setAttribute("state", "ÇëµÇÂ¼");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(resource);
		rd.forward(req, resp);
	}
}
