package com.message.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.dao.MessageDao;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("mid") != null) {
			int mid = Integer.parseInt(req.getParameter("mid"));
			MessageDao m = new MessageDao();
			m.deleteMessage(mid);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/view/main.jsp");
		rd.forward(req, resp);
	}
}