<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:blue" align="center">File Upload Page</h2>
<form action="upload" method="POST" enctype="multipart/form-data">
<center>
<table>
<tr>
	<td>File</td>
	<td><input type="file" name="file"/></td>
</tr>
<tr>
	<td><input type="submit" value="Upload"></td>
</tr>
</table>
</center>
</form>
</body>
</html>