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
					<a href="index.html">天一时代留言本 1.0</a>
				</h1>
				<div class="blog-desc">欢迎光临天一时代</div>
			</div>
		</div>
		<div id="mainWrapper">
			<div id="content" class="content-wide">
				<c:forEach items="${messages }" var="message">
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
				<a href="/note/back">返回主页</a>
			</div>
		</div>
		<div id="footer">
			<div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
		</div>

	</div>
</body>
</html>
