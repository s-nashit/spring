<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>

<%
int a = 1/0; %>
<%-- <%

try{
	int a = 99/0;
	out.print(a);
}
catch(Exception ex){
	out.print("error is: "+ ex.getMessage());
}
%> --%>
</h1>

</body>
</html>