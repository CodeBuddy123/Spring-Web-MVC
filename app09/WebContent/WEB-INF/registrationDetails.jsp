<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color: red;" align="center">Ashish Software Solutions</h2>
<h3 style="color: green;" align="center">Student Registration Details</h3>
<center>
<table border='1' bgcolor='lightblue'>
<tr>
	<td>Student ID</td>
	<td>${std.sid}</td>
</tr>
<tr>
	<td>Student Name</td>
	<td>${std.sname}</td>
</tr>
<tr>
	<td>Student Email</td>
	<td>${std.semail}</td>
</tr>
<tr>
	<td>Student Mobile</td>
	<td>${std.smobile}</td>
</tr>
</table>
</center>
</body>
</html>