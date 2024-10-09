<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>
</head>
<body>
<h1>About Us Page</h1>
<%
	String name = (String) request.getAttribute("name");
out.println(name);
String location = (String) request.getAttribute("location");
out.println(location);

%>

</body>
</html>