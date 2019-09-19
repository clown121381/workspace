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
 * Servlet implementation class deletServlet
 */
@WebServlet("/deletServlet")
public class deletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("sid") != null) {
			String sid = req.getParameter("sid");
			StudentDao dao = new StudentDao();
			dao.deleteStu(sid);
			RequestDispatcher rd = req.getRequestDispatcher("/FindAll");
			rd.forward(req, resp);
		}
	}
}
