<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student Result</title>
</head>
<%
	HttpSession sess = request.getSession(false);
	if (sess == null) {
		session.setAttribute("msg", "You are not sign in.");
		RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
		rd.forward(request, response);
	}
%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<body>
	<h1>
		Deleted success 
	</h1>

	Click <a href="Delete.jsp">here</a> to delete another user.
	Click <a href="Home.jsp">here</a> to go home page.
</body>
</html>