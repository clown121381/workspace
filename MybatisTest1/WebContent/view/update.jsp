<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>修改Message</h1>
<form action="/MybatisTest1/Addservlet" method="post">
	id:<input type="text" name="mid">
	作者:<input type="text" name="author">
	标题:<input type="text" name="title"><br>
	内容:<textarea name="content" rows="5" cols="53">content:</textarea><br>
	邮件:<input type="text" name="email">
	日期:<input type="text" name="add_date" value="">
	<input type="submit" value="提交">
</form>
</body>
</html>