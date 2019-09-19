package com.control;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Table_Dept;
import com.dao.MapperDao;

/**
 * Servlet implementation class AddDept
 */
@WebServlet("/AddDept")
public class AddDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String d1 = null;
		String d2 = null;
		String vendor = null;
		if(req.getParameter("T1") != null) {
			d1 = req.getParameter("T1");
		}
		
		if(req.getParameter("T2") != null) {
			d2 = req.getParameter("T2");
		}
		
		if(req.getParameter("D1") != null) {
			vendor = req.getParameter("D1");
		}
		
		MapperDao dao = new MapperDao();
		List<Table_Dept> li = dao.selectAllDept();
		req.setAttribute("d1", d1);
		req.setAttribute("d2", d2);
		req.setAttribute("vendor", vendor);
		req.setAttribute("dept_li", li);
		
		String date1 = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		req.setAttribute("date1", date1);
		
		RequestDispatcher rd = req.getRequestDispatcher("/view/billAddDeptItem.jsp");
		rd.forward(req, resp);
	}

}