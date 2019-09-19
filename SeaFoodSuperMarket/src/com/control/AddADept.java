 package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class AddADept
 */
@WebServlet("/AddADept")
public class AddADept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("T1");
		String desc = req.getParameter("T2");
		MapperDao dao = new MapperDao();
		dao.insertDept(name, desc);
		req.getRequestDispatcher("/FindAllDept").forward(req, resp);

	}
}