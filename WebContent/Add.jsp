<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="pojo.StudentPojo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>
<style>
#home {
	padding-right: 100px;
}

#message {
	padding-right: 100px;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<%
	HttpSession sess = request.getSession(false);
	if (sess == null) {
		response.sendRedirect("SignIn.jsp");
	} else if (session.getAttribute("data") == null) {
		response.sendRedirect("SignIn.jsp");
	}
	else if (((StudentPojo) request.getAttribute("data"))!= null)
	{
		int id = ((StudentPojo) request.getAttribute("data")).getId();
		out.println(id);
	}

	String message = null;
	if (request.getAttribute("msg") != null) {
		message = (String) request.getAttribute("msg");
	}
%>

<body>
	<div id=add align="center" style="float: center">
		<div id="message">
			<%
				if (message != null)
					out.print("<span style='text-align: center;'>" + message + "</span>");
			%>
		</div>


		<div style="width: 500px; height: 150px;">
			Add New Student <br> <br>
			<form action="AddServlet" method='POST'>
				<label>Name: </label><input type="textbox" name="name" value="">
				<br> <br> <label>Contact: </label><input type="textbox"
					name="contact" value=""><br> <br> <input
					type="submit" name="submit" value="Submit"> <input
					type="reset" value="Clear">
			</form>
		</div>
	</div>
</body>
</html>