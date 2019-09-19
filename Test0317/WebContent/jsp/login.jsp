<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		用户名：<input id="username" type="text" name="username" placeholder="请输入用户名"><span></span><br>
		密码：<input type="password" name="password" placeholder="请输入密码"><br>
		<input type="submit" value="提交">
	</form>
	<script>
	 	$('#username').blur(function () {
	        var url="/Test0317/Login";
	        var data = {username:$('#username').val().trim()};
	        $.post(url,data,function () {
	            alert(r);
	            $('#username').next().html();
	        });
	    });
	</script>
</body>
</html>