package com.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Table_Income;
import com.dao.MapperDao;

/**
 * Servlet implementation class FindDeptIncome
 */
@WebServlet("/FindDeptIncome")
public class FindDeptIncome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MapperDao dao = new MapperDao();
		List<Table_Income> li = dao.selectSysIncome();
		Map<String ,String> dept = new HashMap<String,String>();
		for(Table_Income in : li) { 
			dept.put(in.getDept_id().toString(), dao.selectADept(in.getDept_id()).getDept_name());	
		}
		System.out.println(li);
		System.out.println(dept);
		req.setAttribute("income_li", li);
		req.setAttribute("dept_map", dept);
		req.getRequestDispatcher("/view/incomeMain.jsp").forward(req, resp);
	}
}
