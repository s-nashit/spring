<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
Name : <input type = "text" name="uname"/>
<input type ="submit" >
<br/>
<!-- <% out.println("welcome to our application. Mr. "+request.getParameter("uname")); %>
 -->
<h1>
Welcome to our page : ${param.uname}

</h1>
</form>

</body>
</html>