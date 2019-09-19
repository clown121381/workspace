<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.message.Message" %>
<%@ page import="MybatisUtil.Mybatis_Util" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.mapper.MessageMapper" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>天一时代留言本</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="/NoteBook/images/web.css" rel="stylesheet" type="text/css">
</head>
<%
	List<Message> li = (List<Message>)request.getAttribute("li");
%>    
<body>
<div id="wrapper">
        <div id="header">
                 <div id="logo"></div>
                        <div id="blog-header">
                            <h1 class="blog-title"><a href="index.html">天一时代留言本 1.0</a></h1>
                            <div class="blog-desc">欢迎光临天一时代</div>
                        </div>
                        <div id="menu">
                            <ul>
                                <li><a href="#">留言首页</a></li>
                                <li><a href="/NoteBook/view/new.html">签写留言</a></li>
								<li><a href="/NoteBook/view/login.html">登陆后台</a></li>
                            </ul>
                        </div>
        </div>
        
		<div id="mainWrapper">
               <div id="content" class="content-wide">
	<% for(Message mess : li) {%>
               <div class="textbox">
								<div class="textbox-title">
								
								<div class="textbox-label">[标题 ][留言者:<%=mess.getAuthor() %> ][留言日期:<%=mess.getAdd_date().substring(0,10) %> ]</div>
								</div>
								<div class="textbox-content"><%=mess.getContent() %></div>
								
								<div class="textbox-bottom">邮箱: <%=mess.getEmail() %> | <a href="/NoteBook/DeleteServlet?mid=<%=mess.getMid()%>" >删除</a>| <a href="/NoteBook/view/update.jsp?mid=<%=mess.getMid()%>" >修改</a></div>
			  </div>
	<%} %>
<a href="/NoteBook/view/main.jsp">返回首页</a>
                    </div>
                </div>
                <div id="footer">
                    <div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
                </div>
            
        </div>  
</body>
</html>
