package com.message.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.Message;
import com.message.dao.MessageDao;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String username = null;
    	String email = null;
    	String content = null;
    	if(req.getParameter("userName") != null && req.getParameter("userName") != "") {
    		username = new String(req.getParameter("userName").getBytes("ISO-8859-1"),"UTF-8");
    	}
    	
    	if(req.getParameter("email") != null && req.getParameter("email") != "") {
    		email = new String(req.getParameter("email").getBytes("ISO-8859-1"),"UTF-8");
    	}

    	if(req.getParameter("content") != null && req.getParameter("content") != "") {
    		content = new String(req.getParameter("content").getBytes("ISO-8859-1"),"UTF-8");
    	}
    	
    	MessageDao dao = new MessageDao();
    	List<Message> li = dao.findMessage(username, email, content);
    	System.out.println(li);
    	req.setAttribute("li", li);
    	RequestDispatcher rd = req.getRequestDispatcher("/view/result.jsp");
    	rd.forward(req, resp);
    }
}
