<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVC/submitLog" method="post">
		Username: <input type="text" name="username" /><br><br>
		password: <input type="text" name="password" /><br><br>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>