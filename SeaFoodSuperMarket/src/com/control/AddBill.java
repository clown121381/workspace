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

import com.bean.Table_Vendor;
import com.dao.MapperDao;

/**
 * Servlet implementation class AiddBill
 */
@WebServlet("/AddBill")
public class AddBill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MapperDao dao = new MapperDao();
		List<Table_Vendor> li = dao.selectAllVendor();
		if(li != null) {
			req.setAttribute("vendor_li", li);
		}
		String date1 = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		String date2 = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		req.setAttribute("date1", date1);
		req.setAttribute("date2", date2);
		
		RequestDispatcher rd = req.getRequestDispatcher("/view/BillAdd.jsp");
		rd.forward(req, resp);
	}
}
