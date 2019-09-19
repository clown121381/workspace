package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s_name = null;
		String s_sex = null;
		String s_age = null;
		if(req.getParameter("s_name") != null) {
			s_name = new String(req.getParameter("s_name").getBytes("ISO-8859-1"),"UTF-8");
		}
		
		if(req.getParameter("s_sex") != null) {
			s_sex = req.getParameter("s_sex");
		}
		
		if(req.getParameter("s_age") != null) {
			s_age = new String(req.getParameter("s_age").getBytes("ISO-8859-2"),"UTF-8");
		}
		
		StudentDao dao = new StudentDao();
		dao.newStu(s_name, s_sex, s_age);
		
		RequestDispatcher rd = req.getRequestDispatcher("/FindAll");
		rd.forward(req, resp);
		
	}
}
