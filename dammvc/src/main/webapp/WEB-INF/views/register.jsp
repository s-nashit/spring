<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<!--  <% 
String h = (String) request.getAttribute("header");
out.println(h);
%>
</h1>-->

<h1> ${Header } </h1>


<div align='center'>
<form action="success">

<table>
<tr><td>Name</td> <td><input type = "text" name ="uname"/></td></tr>
<tr><td>Mail</td> <td><input type = "text" name ="mail"/></td></tr>
<tr><td>Phone</td> <td><input type = "text" name ="phone"/></td></tr>
<tr><td><input type = "submit" name ="submit" value ="register"/></td></tr>
</table>
</form>
</div>





</body>
</html>