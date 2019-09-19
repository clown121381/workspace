package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Center
 */
@WebServlet("/Center")
public class Center extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String choose = req.getParameter("photo");
		
		if(choose != null) {
			req.setAttribute("photo", choose);	
			req.setAttribute("lan", getString(choose));
			RequestDispatcher rd = req.getRequestDispatcher("/jsp/result.jsp");
			rd.forward(req, resp);
		} else {
			resp.getWriter().write("out");
		}
	}
	
	private static String getString(String choose) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "the April is your lie1");
		map.put("2", "the April is your lie2");
		map.put("3", "the April is your lie3");
		map.put("4", "the April is your lie4");
		map.put("5", "the April is your lie5");
		map.put("6", "the April is your lie6");
		map.put("7", "the April is your lie7");
		map.put("8", "the April is your lie8");
		return map.get(choose);
	}
}
