package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.dao.MessageDao;

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("mid") != null) {
			int mid = Integer.parseInt(req.getParameter("mid"));
			MessageDao m = new MessageDao();
			m.deleteMessage(mid);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/FindAll");
		rd.forward(req, resp);
	}
}
