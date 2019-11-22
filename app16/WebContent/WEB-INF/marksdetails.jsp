<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:green" align="center">Ashish International School</h2>
<h3 style="color:blue" align="center">Student Marks Details</h3>
<center>
<table border='1' bgcolor='lightblue'>
<tr>
	<td>Student Name</td>
	<td>${student.sname}</td>
</tr>
<tr>
	<td>Course Name</td>
	<td>${student.scourse}</td>
</tr>
<tr>
	<td>Course Marks</td>
	<td>${student.smarks}</td>
</tr>
</table>
</center>
</body>
</html>