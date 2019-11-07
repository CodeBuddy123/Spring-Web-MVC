<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:green" align="center">Ashish Software Solutions</h2>
<h1 style="color:purple" align="center">Registration Details</h1>
<center>
<table border='1' bgcolor='lightyellow'>
<tr>
	<td>User Name</td>
	<td>${user.uname}</td>
</tr>
<tr>
	<td>Password</td>
	<td>${user.upwd}</td>
</tr>
<tr>
	<td>User Age</td>
	<td>${user.uage}</td>
</tr>
<tr>
	<td>User Date of Birth</td>
	<td>${user.udob}</td>
</tr>
<tr>
	<td>User Email</td>
	<td>${user.uemail}</td>
</tr>
<tr>
	<td>User Mobile</td>
	<td>${user.umobile}</td>
</tr>
</table>
</center>
</body>
</html>