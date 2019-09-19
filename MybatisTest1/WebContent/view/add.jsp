<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>添加</title>
</head>
<body>
<%
	Date date = new Date();
	String d = new SimpleDateFormat("yyyy-MM-dd").format(date);
%>
<h1>添加Message</h1>
<form action="/MybatisTest1/Addservlet" method="post">
	作者:<input type="text" name="author">
	标题:<input type="text" name="title"><br>
	内容:<textarea name="content" rows="5" cols="53">content:</textarea><br>
	邮件:<input type="text" name="email">
	日期:<input type="text" name="add_date" value="<%=d %>">
	<input type="submit" value="提交">
</form>
</body>
</html>