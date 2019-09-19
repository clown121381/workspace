<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>写留言-天一时代留言本</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="/note/images/web.css" rel="stylesheet" type="text/css">
</head>
<body>
<form name="myform" method="post" action="updateMess" onSubmit="this.regsubmit.disabled=true;">
 <div id="wrapper">
           
                <div id="header">
                    
                        <div id="logo"><img src="images/logo.gif"/></div>
                        <div id="blog-header">
                            <h1 class="blog-title"><a href="index.html">天一时代留言本 1.0</a></h1>
                            <div class="blog-desc">欢迎光临天一时代留言本</div>
                        </div>
                </div>
				<div id="mainWrapper">
                    <div id="content" class="content-wide">
                        
							<div class="textbox">
								<div class="textbox-title">
									<h4>签名留言</h4>
								</div>
								<div class="textbox-content">
<li>昵称:
<input name="author" type="text" id="yhm" value="${message.author }"></li>
<input name="mid" type="hidden" id="yhm" value="${message.mid }"></li>
<li>标题：
<input name="title" type="text" id="email" value="${message.title }"></li>
<li>邮箱:
<input name="email" type="text" id="email" value="${message.email }"></li>
<li>内容:
<textarea name="content" cols="60" rows="10" >${message.content }</textarea></li>
							  </div>
								<div class="textbox-bottom">
								  <input type="submit" name="regsubmit" value="提交" class="btn">
								</div>
							</div>
                      
                    </div>
                    <p style="color: red;">${mess }</p>
                </div>
                <div id="footer">
                    <div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
                </div>
        </div>
</form>
</body>
</html>
