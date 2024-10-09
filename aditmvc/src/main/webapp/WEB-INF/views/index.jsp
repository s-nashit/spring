<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${Head}</h1>
<h1>Home Page</h1>
<a href="about">About-US</a>
<a href="register">Register</a>
<h2>
<!--  <%
String a = (String) request.getAttribute("name");
out.println(a);
%>-->
${name}

</h2>

<h2>
${mail }
</h2>

</body>
</html>