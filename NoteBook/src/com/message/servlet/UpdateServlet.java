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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 	String mid = null;
		 	String yhm = null;
	    	String email = null;
	    	String content = null;
	    	
	    	if(req.getParameter("mid") != null) {
	    		mid = new String(req.getParameter("mid").getBytes("ISO-8859-1"),"UTF-8");    		
	    	}
	    	
	    	
	    	if(req.getParameter("yhm") != null) {
	    		yhm = new String(req.getParameter("yhm").getBytes("ISO-8859-1"),"UTF-8");    		
	    	}
	    	
	    	if(req.getParameter("email") != null) {
	    		email = new String(req.getParameter("email").getBytes("ISO-8859-1"),"UTF-8");
	    	}
	    	
	    	if(req.getParameter("content") != null) {
	    		content = new String(req.getParameter("content").getBytes("ISO-8859-1"),"UTF-8");
	    	}
	    	MessageDao m = new MessageDao();
	    	m.updateMessage(mid, yhm, email+"¡Ù—‘", content, email);
	    	RequestDispatcher rd = req.getRequestDispatcher("/view/main.jsp");
			rd.forward(req, resp);
	    }  

}
