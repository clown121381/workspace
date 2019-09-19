package com.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Table_Dept;
import com.bean.Table_Income;
import com.dao.MapperDao;

/**
 * Servlet implementation class UpdateIncome
 */
@WebServlet("/FindIncome")
public class FindIncome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String income_id = req.getParameter("income_id");
		MapperDao dao = new MapperDao();
		List<Table_Dept> depts = dao.selectAllDept();
		
		Table_Income income = dao.selectIncomeById(Integer.parseInt(income_id));
		req.setAttribute("income", income);
		req.setAttribute("depts", depts);
		req.getRequestDispatcher("/view/incomeUpdate.jsp").forward(req, resp);
	}
}