<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.StudentPojo"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login in Successful</title>
</head>



<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<body>
	<center>
		<h1>
			Your student id is
			<%
			HttpSession sess = request.getSession(false);
			if (sess == null) {
				response.sendRedirect("SignIn.jsp");
			} else if (session.getAttribute("data") == null) {
				response.sendRedirect("SignIn.jsp");
			}
			((StudentPojo) request.getAttribute("data")).getId();
		%>
		</h1>
</body>
</html>