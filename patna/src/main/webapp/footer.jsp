<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> 
<% out.println(new java.util.Date()); %>
</p>
<h3>
<%
Integer counter = (Integer)application.getAttribute("hitCounter");
if(counter==null || counter== 0){
	
	counter = 1;
}
else{
	counter++;
}
application.setAttribute("hitCounter", counter);
%>

Visitor Number: <%= counter %>

</h3>

</body>
</html>