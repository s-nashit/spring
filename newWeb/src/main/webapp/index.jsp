<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>

	<script>
const name = prompt("enter name")
</script>

	<%
String name = request.getParameter("name");
out.println("wlcome "+name);
%>




</body>
</html>