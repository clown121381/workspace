package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class AddIncome
 */
@WebServlet("/AddIncome")
public class AddIncome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String deptid = req.getParameter("D1");
		String dailyincome = req.getParameter("T2");
		
		MapperDao dao = new MapperDao();
		dao.insertIncome(Integer.parseInt(deptid), dailyincome);
		
		req.getRequestDispatcher("/FindDeptIncome").forward(req, resp);
	}
}

