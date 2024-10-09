<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.html"></jsp:include>

<form>
Name: <input type="text" name="uname"/>
<br/><br/>
Age: <input type="number" name="age"/>
<br/><br/>
Gender <br/>
<input type="radio" name="gender" value="male" /> Male
<br/>
<input type="radio" name="gender" value="male" /> Female
<br/><br/>

NSTI: 
<select name="nsti">
  <option value="Allahabad">Allahabad</option>
  <option value="Patna">Patna</option>
  <option value="Dehradun">Dehradun</option>
  <option value="Bengaluru">Bengaluru</option>
</select>

<br/><br/>

<input type="submit" name="save" />

<br/><br/>

<table border=1px  style="width:100%">
<tr>
<th>Name</th>
<th>Age</th>
<th>Gender</th>
<th>NSTI</th>
</tr>


<tr>
<td>${param.uname}</td>
<td>${param.age}</td>
<td>${param.gender}</td>
<td>${param.nsti}</td>
</tr>
</table>


</form>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>