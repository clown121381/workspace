<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>new</title>
</head>
<body>
<form action="/Student/NewServlet" method="post">
	姓名：<input type="text" name="s_name"><br>
	男：<input type="radio" name="s_sex" value="man">女：<input type="radio" name="s_sex" value="woman"><br>
	年龄：<input type="text" name="s_age">
	<input type="submit" value="提交">
</form>
</body>
</html>