<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是一个标题</title>
</head>
<body>
<h1>hello</h1>
<a href="/webdemo02/Servlet01">跳转到sevrlet01</a>
<form action="/webdemo02/Servlet02" method="get">
	姓名:<input type="text" name="username" value="">
	<input type="submit">
</form>

<form action="/webdemo02/view/haha.html">
	<input type="submit" value="提交">
</form>
</body>
</html>