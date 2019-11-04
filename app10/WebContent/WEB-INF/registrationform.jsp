<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	color:red;
	font-family:consolas;
	font-style:italic;
	font-weight: bold;
	font-size: large;
}
</style>
</head>
<body>
<h2 style="color:red" align="center">Ashish Software Solutions</h2>
<h3 style="color:blue" align="center">User Registration Page</h3>
<form:form action="reg" method="POST" commandName="user">
<center>
<table>
<tr>
	<td>User Name</td>
	<td><form:input path="uname"/>
	<td><form:errors path="uname" cssClass="error"/>
</tr>
<tr>
	<td>Password</td>
	<td><form:password path="upwd"/>
	<td><form:errors path="upwd" cssClass="error"/>
</tr>
<tr>
	<td>User Age</td>
	<td><form:input path="uage"/>
	<td><form:errors path="uage" cssClass="error"/>
</tr>
<tr>
	<td>User Email</td>
	<td><form:input path="uemail"/>
	<td><form:errors path="uemail" cssClass="error"/>
</tr>
<tr>
	<td>User Mobile</td>
	<td><form:input path="umobile"/>
	<td><form:errors path="umobile" cssClass="error"/>
</tr>
<tr>
	<td><input type="submit" value="Register"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>