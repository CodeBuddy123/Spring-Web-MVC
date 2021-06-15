<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${!empty countriesinfo}">
 	<h1 style="color:red;text-align:center">All Countries are</h1> 
		<c:forEach var="country" items="${countriesinfo}">
			<li><b>${country}</b></li>
		</c:forEach>
	</c:when>
	<c:otherwise>
		<h1 style="color:red ; text-align:center">Not able to Retrieve Countries</h1>
	</c:otherwise>	
	</c:choose>
	<br>
	<h1><a href="welcome.do">Home</a></h1>
	
</body>
</html>