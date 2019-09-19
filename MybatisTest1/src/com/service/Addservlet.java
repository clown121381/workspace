package com.service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.dao.MessageDao;
import com.message.Message;

import MybatisUtil.Mybatis_Util;

@WebServlet("/Addservlet")
public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Message m = new Message();
		if(req.getParameter("author") != null && req.getParameter("author") != "") {
			m.setAuthor(req.getParameter("author"));			
		}
		
		if(req.getParameter("title") != null && req.getParameter("title") != "") {
			m.setTitle(req.getParameter("title"));			
		}
		
		if(req.getParameter("content") != null && req.getParameter("content") != "") {
			m.setContent(req.getParameter("content"));			
		}
			
		if(req.getParameter("email") != null && req.getParameter("email") != "") {
			m.setEmail(req.getParameter("email"));			
		}
		String s = req.getParameter("add_date");
		if(s != null && s != "") {
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
			m.setAdd_date(date);			
		}
			
		
		SqlSession session = Mybatis_Util.getSqlSession(true);
		MessageDao mess = session.getMapper(MessageDao.class);
		String d=new SimpleDateFormat("yyyy-MM-dd").format(m.getAdd_date());
		int result = mess.addMessage(m.getAuthor(),m.getTitle(),m.getContent(),m.getEmail(),d);
		req.setAttribute("result", result);
		
		RequestDispatcher rd = req.getRequestDispatcher("/view/addResult.jsp");
		rd.forward(req, resp);
	}
}
