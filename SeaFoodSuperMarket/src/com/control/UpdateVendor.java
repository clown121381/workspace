package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Table_Vendor;
import com.dao.MapperDao;

/**
 * Servlet implementation class UpdateVendor
 */
@WebServlet("/UpdateVendor")
public class UpdateVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String vendor_id = req.getParameter("vendor_id");
		if(vendor_id != null) {
			
			MapperDao dao = new MapperDao();
			Table_Vendor vendor = dao.selectVendorById(Integer.parseInt(vendor_id));
			req.setAttribute("vendor", vendor);
			
		}
		
		req.getRequestDispatcher("/view/vendorUpdate.jsp").forward(req,resp);
	}
}
