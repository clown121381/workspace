package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class Update
 */
@WebServlet("/UpdateAVendor")
public class UpdateAVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("T1");
		String address =new String(req.getParameter("T2").getBytes("ISO-8859-1"),"UTF-8");
		String phone = req.getParameter("T3");
		String fax = req.getParameter("T4");
		String person = req.getParameter("T5");
		String id = req.getParameter("vendor_id");
		
		MapperDao dao = new MapperDao();
		dao.updateVendor(Integer.parseInt(id), name, address, fax, phone, person);
		
		req.getRequestDispatcher("/FindAllVendor").forward(req, resp);
	}
}
