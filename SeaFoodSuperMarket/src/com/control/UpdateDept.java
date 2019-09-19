package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Table_Dept;
import com.dao.MapperDao;

/**
 * Servlet implementation class UpdateDept
 */
@WebServlet("/UpdateDept")
public class UpdateDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dept_id = req.getParameter("dept_id");
		MapperDao dao = new MapperDao();
		Table_Dept dept = dao.selectADept(Integer.parseInt(dept_id));
		req.setAttribute("dept", dept);
		req.getRequestDispatcher("/view/departmentUpdate.jsp").forward(req, resp);
	}
}
