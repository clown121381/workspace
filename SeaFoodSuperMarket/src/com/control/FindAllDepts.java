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
 * Servlet implementation class FindAllDepts
 */
@WebServlet("/FindAllDepts")
public class FindAllDepts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MapperDao dao = new MapperDao();
		List<Table_Dept> depts = dao.selectAllDept();
		System.out.println(depts);
		req.setAttribute("depts", depts);
		req.getRequestDispatcher("/view/incomeAdd.jsp").forward(req, resp);
		
	}

}