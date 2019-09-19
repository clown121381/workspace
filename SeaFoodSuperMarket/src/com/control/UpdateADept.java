package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class UpdateADept
 */
@WebServlet("/UpdateADept")
public class UpdateADept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("dept_id");
		String name = req.getParameter("T1");
		String desc = new String(req.getParameter("T2").getBytes("ISO-8859-1"),"UTF-8");
		MapperDao dao = new MapperDao();
		dao.updateDept(Integer.parseInt(id), name, desc);
		req.getRequestDispatcher("/FindAllDept").forward(req, resp);
	}
}