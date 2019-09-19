package com.control;

import java.io.IOException;
import java.text.ParseException;
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
import com.bean.Table_bill;
import com.dao.MapperDao;

/**
 * Servlet implementation class FindAVendor
 */
@WebServlet("/FindAVendor")
public class FindAVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	if(req.getParameter("T1") != null) {
    		String vendor_name = req.getParameter("T1");
    		req.setAttribute("vendor_name", vendor_name);
    		MapperDao dao = new MapperDao();
    		Table_Vendor vendor = dao.selectVendorByName(vendor_name);
    		Integer vendor_id = vendor.getVendor_id();
    		List<Table_bill> bills = dao.selectBillByVendorId(vendor_id);
    		for(Table_bill bill : bills) {
    			try {
					Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(bill.getBill_date());
					bill.setBill_date(new SimpleDateFormat("dd/MM/yyyy").format(d1));
					Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(bill.getBill_due_date());
					bill.setBill_due_date(new SimpleDateFormat("dd/MM/yyyy").format(d2));
				} catch (ParseException e) {
					e.printStackTrace();
				}
    		}
    		req.setAttribute("bills", bills);
    	}
    	
    	RequestDispatcher rd = req.getRequestDispatcher("/view/billPayment.jsp");
		rd.forward(req, resp);
    }
}