<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<h1> Getting data from jsp</h1>
<h2>
<%
String name = request.getParameter("fname");
String sal = request.getParameter("sal");
out.print("welcome to JSP. "+ sal + ". " + name);
%>
</h2>
<h2>
<%
int num = Integer.parseInt(request.getParameter("number"));
for(int i =1; i<=10; i++){
	out.println(num + "*" + i + "=");
	out.println(num * i + "</br>");
}
%>

</h2>


</body>
</html>