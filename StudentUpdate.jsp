<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<h3>Student Updation Details</h3>
<c:url var="updateaction" value="/updateStu"/>
<form:form action="${updateaction}" method="post" modelAttribute="editForm">
<table>
<tr>
	<td>Student Id:</td>
	<td><form:input text="text" path="studentid" readonly="true"/></td>
</tr>
<tr>
	<td>Student Name:</td>
	<td><form:input type="text" path="name"/><font color="red"><form:errors path="name"/></font></td>
</tr>
<tr>
	<td>Age:</td>
	<td><form:input text="text" path="age" readonly="true"/></td>
</tr>
<tr>
	<td>Gender:</td>
	<td><form:radiobutton path="gender" value="male" onclick="return false"/>Male
		<form:radiobutton path="gender" value="female" onclick="return false"/>Female
	</td>
</tr>
<tr>
	<td>Date of Birth:</td>
	<td><form:input type="date" path="dob"/><font color="red"><form:errors path="dob"/></font></td>
</tr>
<tr>
	<td>Address:</td>
	<td><form:input type="text" path="address"/><font color="red"><form:errors path="address"/></font></td>
</tr>
<tr>
	<td><input type="submit" value="Update Student"/></td>
</tr>
</table>
</form:form>
</body>
</html>