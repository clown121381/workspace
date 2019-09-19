package com.yang.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if("java".equals(username)) {
			req.setAttribute("mess", "�û����Ѵ���");
		}else {
			req.setAttribute("mess", "����ʹ��");
			Cookie c = new Cookie("state","on");
			resp.addCookie(c);
		}
		resp.sendRedirect("/Test0317/jsp/success.jsp");
	}
}
