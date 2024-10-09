<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP with Spring</h1>
<a href="about.jsp">Redirect</a>
<h2>

<!-- Expression Language -->

<%
String a = (String) request.getAttribute("name");
out.println(a);
String b = (String) request.getAttribute("location");
out.println(b);
%>
</h2>

</body>
</html>