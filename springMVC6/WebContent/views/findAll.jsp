<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1px solid black" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>AGE</td>
				<td>SEX</td>
			</tr>
			<c:forEach items="${students }" var="student">
				<tr>
					<td>${student.s_id }</td>
					<td>${student.s_name }</td>
					<td>${student.s_age }</td>
					<td>${student.s_sex }</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>