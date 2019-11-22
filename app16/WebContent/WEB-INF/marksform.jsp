<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:green" align="center">Ashish International School</h2>
<h3 style="color:blue" align="center">Student Marks Form</h3>
<form:form action="marks" method="POST" commandName="student">
<center>
<table>
<tr>
	<td>Student Name</td>
	<td><form:input path="sname" /></td>
</tr>
<tr>
	<td>Course</td>
	<td><form:input path="scourse"/></td>
</tr>
<tr>
	<td>Marks</td>
	<td><form:input path="smarks"/></td>
</tr>
<tr>
<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>