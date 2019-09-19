package com.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Table_Dept;
import com.dao.MapperDao;

/**
 * Servlet implementation class FindAllDept
 */
@WebServlet("/FindAllDept")
public class FindAllDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MapperDao dao =new MapperDao();
		List<Table_Dept> li = dao.selectAllDept();
		req.setAttribute("dept_li", li);
		req.getRequestDispatcher("/view/departmentMain.jsp").forward(req, resp);
	}
}
