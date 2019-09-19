package com.service;

import java.io.IOException;

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

/**
 * Servlet implementation class Findservlet
 */
@WebServlet("/Findservlet")
public class Findservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int mid = Integer.parseInt(req.getParameter("mid"));
		System.out.println(mid);
		SqlSession session = Mybatis_Util.getSqlSession(true);
		MessageDao mess = session.getMapper(MessageDao.class);
		Message m = mess.findMessage(mid);
		
		req.setAttribute("mess", m);
		RequestDispatcher rd = req.getRequestDispatcher("/view/finResult.jsp");
		rd.forward(req, resp);
	}	
}











