package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class UpdateIncome
 */
@WebServlet("/UpdateIncome")
public class UpdateIncome extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String income = req.getParameter("T2");
		String id = req.getParameter("income_id");
		
		MapperDao dao = new MapperDao();
		dao.updateDailyIncome(Integer.parseInt(id), income);
		
		req.getRequestDispatcher("/FindDeptIncome").forward(req, resp);
	}
}