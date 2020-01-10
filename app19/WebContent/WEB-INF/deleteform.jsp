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
<br><br><br>
<form:form action="delete" method="POST" commandName="student">
<center>
<table>
<tr>
	<td>Student ID</td>
	<td><form:input path="sid"/>
</tr>
<tr>
	<td><input type="submit" value="DELETE"/>
</tr>
</table>
</center>
</form:form>
</body>
</html>