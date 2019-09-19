<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.student.dao.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.student.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>
</head>
<body>
<%
	List<Student> li = (List)request.getAttribute("result");
%>
<table border="0" >
	<tr>
		<td>编号</td><td>姓名</td><td>性别</td><td>年龄</td><td>操作</td>
	</tr>
	<%for(Student s : li) {%>
	<tr>
		<td><%=s.getS_id() %></td><td><%=s.getS_name() %></td><td><%=s.getS_sex() %></td><td><%=s.getS_age()%></td>
		<td><a href="/Student/deletServlet?sid=<%=s.getS_id() %>">删除</a>/<a href="/Student/FindOne?sid=<%=s.getS_id() %>">修改</a></td>
	</tr>
	<%} %>
</table>
</body>
</html>