<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cs = request.getCookies();
	int flag = 0;
	for(Cookie c : cs) {
		if("user".equals(c.getName())) {
			flag = 1;
		}
	}
	if(flag == 0) {
		RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
			
	}
%>
<h1>登陆成功呢</h1>
</body>
</html>