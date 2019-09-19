<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>天一时代留言本</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<link href="/note/images/web.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<div id="logo"></div>
			<div id="blog-header">
				<h1 class="blog-title">
					<a href="/note/login.jsp">天一时代留言本 1.0</a>
				</h1>
				<div class="blog-desc">欢迎光临天一时代</div>
			</div>
			<div id="menu">
				<ul>
					<li><a href="/note/new">签写留言</a></li>
				</ul>
			</div>
		</div>

		<div id="mainWrapper">
			<div id="content" class="content-wide">
				<form action="/note/findMessByMore" method="post">
					姓名：<input type="text" name="author" />邮件：<input type="text"
						name="email" />内容：<input type="text" name="content" /> <input
						type="submit" value="查找" />
				</form>
				<br><br>
				<c:forEach items="${pageInfo.list }" var="message">
						<div class="textbox">
							<div class="textbox-title">

								<div class="textbox-label">[标题:${message.title } ][留言者:${message.author } ][留言日期:${message.add_date }
									]</div>
							</div>
							<div class="textbox-content">${message.content }</div>

							<div class="textbox-bottom">
								邮箱: ${message.email } | <a href="/note/delete?mid=${message.mid }">删除</a>| <a href="/note/findMess?mid=${message.mid }">修改</a>
							</div>
						</div>
				</c:forEach>
				<p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages } 页,总 ${pageInfo.total } 条记录</p>
			        <a href="/note/homepage?pageNo=${pageInfo.firstPage}">第一页</a>
			        <c:if test="${pageInfo.hasPreviousPage }">
			            <a href="/note/homepage?pageNo=${pageInfo.pageNum-1}">上一页</a>
			        </c:if>
			        <c:if test="${pageInfo.hasNextPage }">
			            <a href="/note/homepage?pageNo=${pageInfo.pageNum+1}">下一页</a>
			        </c:if>
			        <a href="/note/homepage?pageNo=${pageInfo.lastPage}">最后页</a>
			</div>
		</div>
		
		<div id="footer">
			<div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
		</div>

	</div>
</body>
</html>
