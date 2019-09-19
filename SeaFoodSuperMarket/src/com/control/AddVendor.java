package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class AddVendor
 */
@WebServlet("/AddVendor")
public class AddVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("T1");
		String address = req.getParameter("T2");
		String phone = req.getParameter("T3");
		String fax = req.getParameter("T4");
		String person = req.getParameter("T5");
		MapperDao dao = new MapperDao();
		dao.insertVendor(name, address, fax, phone, person);
		req.getRequestDispatcher("/FindAllVendor").forward(req, resp);
	}
}