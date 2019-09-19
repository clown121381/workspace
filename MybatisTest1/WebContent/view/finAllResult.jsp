<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.message.Message" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${mess}" var="msg" >
        mid:${msg.mid}<br>
        author:${msg.author}<br>
        title:${msg.title}<br>
        content:${msg.content}<br>
        email:${msg.email}<br>
        date:${msg.add_date}<br>
</c:forEach>
</body>
</html>