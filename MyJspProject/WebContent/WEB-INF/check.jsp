<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "packageone.LoginDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		LoginDao dao = new LoginDao();
		int result = dao.login(name, pwd);
		if(result > 0){
			out.print("success");
		}else if(result == 0){
			out.print("failed");
		}else{
			out.print("system error");
		}
	%>
</body>
</html>