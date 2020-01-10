<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table height="550" width="100%">
	<tr height="20%">
		<td colspan="2" bgcolor="maroon" align="center">
			<tiles:insertAttribute name="header"/>
		</td>
	</tr>
	<tr height="65%">
		<td width="20%" align="center" bgcolor="lightyellow">
			<tiles:insertAttribute name="menu"/>
		</td>
		<td width="80%" align="center" bgcolor="lightblue">
			<tiles:insertAttribute name="body"/>
		</td>
	</tr>
	<tr height="15%">
	<td colspan="2" align="center" bgcolor="blue">
			<tiles:insertAttribute name="footer"/>
		</td>
	</tr>
</table>
</body>
</html>