package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MapperDao;

/**
 * Servlet implementation class UpdatePayment
 */
@WebServlet("/Update")
public class UpdatePayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String bill_id = req.getParameter("bill_id");
    	String vendor_name = req.getParameter("vendor_name");
    	if(bill_id != null) {
    		MapperDao dao = new MapperDao();
    		dao.UpdatePaidFlag(Integer.parseInt(bill_id));
    	}
    	resp.sendRedirect("/SeaFoodSuperMarket/FindAVendor?T1="+ vendor_name +"");
    }
}
