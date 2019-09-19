package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.dao.MessageDao;
import com.user.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = null;
		String password = null;
		if(req.getParameter("yhm") != null) {
			id = req.getParameter("yhm");
		}
		
		if(req.getParameter("yhmm") != null) {
			password = req.getParameter("yhmm");			
		}
		
		MessageDao dao = new MessageDao();
		User user = dao.findAUser(id, password);
		System.out.println(user);
		if(user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			System.out.println(user);
			resp.sendRedirect("/NoteBook1/FindAll");
		} else {
			req.setAttribute("state", "”√ªß√˚√‹¬Î¥ÌŒÛ");
			RequestDispatcher rd = req.getRequestDispatcher("/view/login.jsp");
			rd.forward(req, resp);
		}
	}
}
