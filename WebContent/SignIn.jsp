<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
<style>
#home {
	padding-right: 100px;
}

#message {
	padding-right: 100px;
}
</style>
<link rel='stylesheet' type='text/css' href='resource/skins.css'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>

<%
	String message = null;
	if (request.getAttribute("msg") != null) {
		message = (String) request.getAttribute("msg");
	}
%>

<body>
	<div id="header">

		<div id="button" style="float: left">
			<br> <br>
			<form action="Register.jsp">
				<button type="submit" class="btn btn-primary">Register</button>
			</form>
			<br>
			<form action="SignIn.jsp">
				<button type="submit" class="btn btn-primary">SignIn</button>
			</form>

		</div>
		<h1>
			<center>
				<div id="home">
					<a href="Start.jsp">HOME</a>
				</div>
			</center>
		</h1>
	</div>
	<div id=information>
		<center>
			<div id="message">
				<%
					if (message != null)
						out.print("<span style='text-align: center;'>" + message + "</span>");
				%>
			</div>
			<div style="width: 500px; height: 250px; border: 1px solid #000;">
				LOG IN <br> <br>
				<form action="SignInServlet" method="POST">
					<label>Username:</label> <input type="text" name="name"> <br>
					<br> <label>Student ID</label> <input type="number" name="id"
						value="0"> <br>
					<button type="submit" class="btn btn-primary">Submit</button>
					<button type="reset" class="btn btn-primary" value="Clear">Clear</button>
				</form>
			</div>

			<br> <br>
	</div>
</body>
</html>