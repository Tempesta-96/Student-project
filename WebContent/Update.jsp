<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.StudentPojo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
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
<%HttpSession sess = request.getSession(false);
if (sess == null) {
	response.sendRedirect("SignIn.jsp");
} else if (session.getAttribute("data") == null) {
	response.sendRedirect("SignIn.jsp");
	%>
<%
	String message = null;
	if (request.getAttribute("msg") != null) {
		message = (String) request.getAttribute("msg");
		System.out.println(message);
	}
	StudentPojo sp = (StudentPojo)request.getAttribute("update");
	int id = sp.getId();
	String name  = sp.getName();
	String contact = sp.getContact();
%>


<body>
	<div id=information align="center" style="float: center">
		<div id="message">
			<% if (message != null) out.print("<span style='text-align: center;'>" + message + "</span>"); %>
		</div>
		<div style="width: 500px; height: 150px;">
			Update Student<br> <br>
			<form action="UpdateServlet" method="get">
				STUDENT ID : <input type="number" name="id" value="0"> <br>
				STUDENT NAME : <input type="text" name="name"
					value="<%=sp.getName() %>"><br> STUDENT CONTACT : <input
					type="number" name="contact" value="<%=sp.getContact()%>"><br>
				<input type="submit" name="update" value="Submit"> <input
					type="reset" value="Clear">
			</form>
		</div>
	</div>

</body>
</html>