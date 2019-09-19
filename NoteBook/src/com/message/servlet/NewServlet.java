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
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String yhm =null;
    	String email = null;
    	String content = null;
    	if(req.getParameter("yhm") != null) {
    		yhm = new String(req.getParameter("yhm").getBytes("ISO-8859-1"));    		
    	}
    	
    	if(req.getParameter("email") != null) {
    		email = new String(req.getParameter("email").getBytes("ISO-8859-1"));
    	}
    	
    	if(req.getParameter("content") != null) {
    		content = new String(req.getParameter("content").getBytes("ISO-8859-1"));
    	}
    	MessageDao m = new MessageDao();
    	m.addMessage(yhm, email+"¡Ù—‘", content, email);
    	RequestDispatcher rd = req.getRequestDispatcher("/view/main.jsp");
		rd.forward(req, resp);
    }  

}
