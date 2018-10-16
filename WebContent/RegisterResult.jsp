<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.StudentPojo"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login in Successful</title>
</head>
<body>
	<center>
		<h1>
			Your user id is 
			<%=((StudentPojo) request.getAttribute("data")).getId()%>
		</h1>
		
		Click <a href="SignIn.jsp">here</a> to Sign In.



</body>
</html>