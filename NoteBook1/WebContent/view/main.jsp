<%@page import="com.message.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.user.User" %>
<%@ page import="java.util.*" %>
<%@ page import="com.message.Message" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>天一时代留言本</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="images/web.css" rel="stylesheet" type="text/css">
</head>    
<body>
<%
	HttpSession sess = request.getSession();
	User u = (User)sess.getAttribute("user");
	List<Message> li = (List<Message>)request.getAttribute("li");
%>
<div id="wrapper">
        <div id="header">
                 <div id="logo"></div>
                        <div id="blog-header">
                            <h1 class="blog-title"><a href="index.html">天一时代留言本 1.0</a></h1>
                            <div class="blog-desc">欢迎   <%=u.getMessages().get(0).getAuthor() %>  光临天一时代</div>
                        </div>
                        <div id="menu">
                            <ul>
                                <li><a href="index.html">留言首页</a></li>
                                <li><a href="new.html">签写留言</a></li>
								<li><a href="login.html">登陆后台</a></li>
                            </ul>
                        </div>
        </div>
        
		<div id="mainWrapper">
               <div id="content" class="content-wide">
 			   <form action="#" method="post" >
               姓名：<input type="text" name="userName"/>邮件：<input type="text" name="email"/>内容：<input type="text" name="content"/>
			   <input type="submit" value="查找"/>
			   </form>
			   <br><br>
			   <% for(Message l : li) {%>			 
	               <div class="textbox">
						<div class="textbox-title">
						
						<div class="textbox-label">[标题 :<%=l.getTitle() %>][留言者:<%=l.getAuthor() %> ][留言日期:<%=l.getAdd_date() %> ]</div>
						</div>
						<div class="textbox-content"><%=l.getContent()%></div>
						
						<div class="textbox-bottom">邮箱: <%=l.getEmail() %>
							<%if("user".equals(u.getFlag())) {
								if(u.getId().equals(l.getUser_id())) {%>
								| <a href="/NoteBook1/delete?mid=<%=l.getMid() %>" >删除</a>| <a href="/NoteBook1/update?mid=<%=l.getMid() %>" >修改</a>
							<%	} 
							} else if("admin".equals(u.getFlag())) {%>
								| <a href="/NoteBook1/delete?mid=<%=l.getMid() %>" >删除</a>| <a href="/NoteBook1/update?mid=<%=l.getMid() %>" >修改</a>
							<%} %>
						</div>
				  </div>
			  <%} %>
                    </div>
                </div>
                <div id="footer">
                    <div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
                </div>
            
        </div>  
</body>
</html>
