<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% if(session.getAttribute("user")==null){
	response.sendRedirect("login.jsp");
} %>


<h1>
Welcome to our Application

<span style="color:red">
${user}
</span>



</h1>

<p>The residents of the national capital, who were experiencing severe heat and extremely high temperatures for the past few months, are now enjoying heavy rain across the Delhi-NCR region. The downpour has brought down the minimum temperature to 24.8 degrees Celsius.</p>

</body>

<form action="logout">
<input type="submit" value = "logout" />
</form>

</html>