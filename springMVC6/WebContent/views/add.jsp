<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>add</h1><br>
	<form action="/springMVC6/addStudent" method="post">
		ID:<input type="text" name="s_id"><br>
		NAME:<input type="text" name="s_name"><br>
		AGE:<input type="text" name="s_age"><br>
		SEX:<input type="text" name="s_sex"><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>