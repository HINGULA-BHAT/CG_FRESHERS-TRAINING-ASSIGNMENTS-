<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVC/submitReg" method="post">
		Email: <input type="text" name="email" /><br><br>
		Username: <input type="text" name="username" /><br><br>
		Password: <input type="password" name="password" /><br><br>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>