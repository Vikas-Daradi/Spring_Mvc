<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Employee</h2>
<form action="addEmployee" method ="post">
<pre>
		name <input type="text" name="name"/>
		Email<input type="text" name="emailId"/>
		Mobile<input type="text" name="mobile"/>
		<input type="submit" name="add"/>

</pre>
</form>
${msg}

</body>
</html>