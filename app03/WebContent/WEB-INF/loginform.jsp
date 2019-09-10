<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 style="color:red;" align="center">ASHISH SOFTWARE SOLUTIONS</h1>
<h2 style="color:green;" align="center">Login Page</h2>
<form action="statuspage" method="post">
<table align="center" bgcolor='lightyellow'>
<tr>
	<td>User Name</td>
	<td><input type="text" name="uname"></td>
</tr>
<tr>
	<td>Password</td>
	<td><input type="password" name="upwd"></td>
</tr>
<tr>
	<td><input type="submit" value="Login">
</tr>
</table>
</form>
</body>
</html>