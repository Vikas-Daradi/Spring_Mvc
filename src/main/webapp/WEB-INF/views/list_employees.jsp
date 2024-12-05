<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table >
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach var="employee" items="${employees}">
<tr>
<td>${employee.name}</td>
<td>${employee.emailId}</td>
<td>${employee.mobile}</td>
<td><a href = "deleteReg?id=${employee.id}">delete</a></td>
<td><a href = "updateReg?id=${employee.id}">update</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>
