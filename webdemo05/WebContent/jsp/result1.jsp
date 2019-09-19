<%@ page language="java" import="com.servlet.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>结果</h1>
<% 
	Person p = (Person)request.getAttribute("person");
	out.print(p.getUsername());
	out.print(p.getPassword());
%>
<%=p.getUsername() %>
<%=p.getPassword() %>
${ person.getUsername() }
${ person.getPassword() }
</body>
</html>