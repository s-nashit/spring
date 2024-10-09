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

<h2>Register Here</h2>

<div align="center">
<form action="success">
<h3>${Header }</h3>
<table>
<tr><td>Name</td><td><input type="text" name="name"/></td></tr>
<tr><td>Mail</td><td><input type="text" name="mail"/></td></tr>
<tr><td>Phone</td><td><input type="text" name="phone"/></td></tr>
<tr><td><input type="submit" name="submit" value="register" /></td></tr>
</table>

</form>
</div>

</body>
</html>