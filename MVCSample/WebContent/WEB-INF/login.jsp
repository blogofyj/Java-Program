<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>登录</title>
</head>
<body>
	<form action="loginServlet" method = "post">
		用户名：<input type = "text" name = "uname" ><br/>
		密码：<input type = "passward" name = "upwd"><br/>
		<input type = "submit" value = "登录"> 
	</form>
</body>
</html>