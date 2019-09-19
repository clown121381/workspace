<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>亲，请登录</title>
</head>
<body>
<%
	Cookie[] cs = request.getCookies();
	if(cs != null) {
		for(Cookie c : cs) {
			if("user".equals(c.getName())) {
				RequestDispatcher rd = request.getRequestDispatcher("/jsp/ok.jsp");
				rd.forward(request, response);
			}
		}	
	}
	
	String statement = (String)request.getAttribute("statement");
	if(statement != null) {
		out.println(statement);
	}
%>
<form action="/login/LoginServlet" method="post">
	用户名：<input type="text" name="username"><br>
	密码：<input type="password" name="password"><br>
	<input type="submit" value="登陆">
</form>

</body>
</html>