<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>My JSP Page</h1>
<% String name="Nashit"; %>
<% int age = 15; %>
<h2>
<% out.println("Hi " + name + ","); %>
<% %>
Your age is: 
<% out.println(age); %>
</h2><h2>
<% out.println(age*2+2-4); %>
<h2>
<%
if(age>18){out.println("you can vote");}
else{out.println("not eligible");}
%>

</h2>
<h1>
<%-- int num = 18; --%>
<%-- for(int i = 1; i<=10; i++) {
	out.println(num + " * " + i + " = ");
out.println(num * i + "</br>");




}--%>
</h1>


</body>
</html>