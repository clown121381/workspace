package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.Student;
import com.student.dao.StudentDao;

/**
 * Servlet implementation class FindOne
 */
@WebServlet("/FindOne")
public class FindOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("sid");
		StudentDao dao = new StudentDao();
		Student stu = dao.selectOne(sid);
		
		req.setAttribute("stu", stu);
		RequestDispatcher rd = req.getRequestDispatcher("/view/update.jsp");
		rd.forward(req, resp);
		
	}
}
