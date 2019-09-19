package com.service;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class FindAllservlet
 */
@WebServlet("/FindAllservlet")
public class FindAllservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SqlSession session = Mybatis_Util.getSqlSession(true);
		MessageDao mess = session.getMapper(MessageDao.class);
		List<Message> li = mess.findAllMessage();
		
		req.setAttribute("mess", li);
		RequestDispatcher rd = req.getRequestDispatcher("/view/finAllResult.jsp");
		rd.forward(req, resp);
	}
}
