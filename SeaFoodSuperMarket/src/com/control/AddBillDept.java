package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class AddBillDept
 */
@WebServlet("/AddBillDept")
public class AddBillDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String d1 = null;
		String d2 = null;
		String vendor = null;
		String sum = null;
		if(req.getParameter("d1") != null) {
			d1 = req.getParameter("d1");
		}
		
		if(req.getParameter("d2") != null) {
			d2 = req.getParameter("d2");
		}
		
		if(req.getParameter("vendor") != null) {
			vendor = req.getParameter("vendor");
		}
		
		if(req.getParameter("T10") != null) {
			sum = req.getParameter("T10");
		}
		
		MapperDao dao = new MapperDao();
		dao.insertIntoBill(Integer.parseInt(vendor), d1, d2, sum);
		
		String bill_id = dao.selectBillId(Integer.parseInt(vendor), sum, d1, d2);
		String[] dept_num = req.getParameterValues("dept_num");
		String[] dept_chk = req.getParameterValues("dept_chk");
		if(dept_chk != null && dept_num != null) {
			int j = 0;
			for(int i = 0;i < dept_num.length;i ++) {	
				if(!dept_num[i].equals("$") && dept_num[i] != null && dept_num[i] != "") {
					String num = dept_num[i].substring(0,dept_num[i].length()-1);
					dao.insertIntoBillItem(Integer.parseInt(bill_id), Integer.parseInt(dept_chk[j++]), num);					
				}
			}
		}
		RequestDispatcher rd = req.getRequestDispatcher("/view/Description.jsp");
		rd.forward(req, resp);
	}

}
