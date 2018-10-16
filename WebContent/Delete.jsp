<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>
<style>
	#home{
		padding-right:100px;
	}
	#message{
		padding-right:100px;
	}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<%
	HttpSession sess = request.getSession(false);
	if (sess == null) {
		session.setAttribute("msg", "You are not sign in.");
		RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
		rd.forward(request, response);
	}
%>
<%
	String message = null;
	if (request.getAttribute("msg") != null) {
		message = (String) request.getAttribute("msg");
	}
%>

<body>
	<div id=delete align="center" style="float: center">
		<div id="message">
		<% if (message != null) out.print("<span style='text-align: center;'>" + message + "</span>"); %>
		</div>
		<div style="width: 500px; height: 150px;">
			Delete Student<br><br>
			<form action="DeleteServlet" method="get">
				STUDENT ID : <input type="number" name="id" value="0"> <br><br>
				<input
					type="submit" name="delete" value="Submit"> <input
					type="reset" value="Clear">
			</form>
		</div>
	</div>
</body>
</html>