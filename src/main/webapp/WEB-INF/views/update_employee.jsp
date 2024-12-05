<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h2>Update Employee</h2>
<form action="updateEmployee" method ="post">
<pre>
		<input type="hidden" name="id" value="${employee.id}"/>
		Name <input type="text" name="name" value="${employee.name}"/>
		Email<input type="text" name="emailId" value="${employee.emailId}"/>
		Mobile<input type="text" name="mobile" value="${employee.mobile}"/>
		<input type="submit" name="save"/>

</pre>
</form>
${msg}

</body>
</html>