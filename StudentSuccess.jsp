<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DETAILS</title>
</head>
<body>
<h1>Student Details</h1>
<table border="1">
<tr>
	<th>Student Id</th>
	<th>Name</th>
	<th>Age</th>
	<th>Address</th>
	<th>Gender</th>
	<th>Date of Birth</th>
	<th>Action</th>
</tr>	
<c:forEach items="${studentList}" var="stud">
<tr>
	<td>${stud.studentid}</td>
	<td>${stud.name}</td>
	<td>${stud.age}</td>
	<td>${stud.address}</td>
	<td>${stud.gender}</td>
	<td>${stud.dob}</td>
	
	<td><a href="<c:url value='/fetchById/${stud.studentid}'/>">Edit</a>
	<td><a href="<c:url value='/deleteStu/${stud.studentid}'/>">Delete</a></td>
</tr>	
</c:forEach>
	
</table>
</body>
</html>