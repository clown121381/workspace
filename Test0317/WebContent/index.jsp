<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Test0317/LoginService" method="post">
		用户名：<input type="text" name="username" placeholder="请输入用户名"><span>${mess }</span><br>
		密码：<input type="password" name="password" placeholder="请输入密码"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>