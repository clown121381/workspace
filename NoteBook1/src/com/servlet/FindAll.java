package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.Message;
import com.message.dao.MessageDao;
import com.user.User;

/**
 * Servlet implementation class FindAll
 */
@WebServlet("/FindAll")
public class FindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MessageDao dao = new MessageDao();
		List<Message> li = dao.finAllMessage();
		System.out.println(li);
		req.setAttribute("li", li);
		RequestDispatcher rd = req.getRequestDispatcher("/view/main.jsp");
		rd.forward(req, resp);
	}
}
