<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Student/UpdateServlet" method="post">
		<input type="hidden" name="s_id" value="${stu.s_id }">
	姓名：<input type="text" name="s_name" value="${stu.s_name }"><br>
	性别：<input type="text" name="s_sex" value="${stu.s_sex }"><br>
	年龄：<input type="text" name="s_age" value="${stu.s_age }">
	<input type="submit" value="提交">
</form>
</body>
</html>