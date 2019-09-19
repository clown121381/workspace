package com.yang.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/LoginService")
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

    List<String> path = new ArrayList<String>();
    public void init(FilterConfig fConfig) throws ServletException {
    }
	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		Cookie[] cs = req.getCookies();
		if(cs != null) {
			for(Cookie c:cs) {
				if(c.getName().equals("state") && c.getValue().equals("on")) { 
					req.getRequestDispatcher("/jsp/success.jsp").forward(req, resp);					
				}
			}
		}
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}


}



