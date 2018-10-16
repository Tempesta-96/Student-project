<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.*"%>
<%@ page import="pojo.SignInPojo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing</title>
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
		response.sendRedirect("SignIn.jsp");}
	else if(session.getAttribute("data")== null){
		response.sendRedirect("SignIn.jsp");
	}
%>
<%
	String message = null;
	if (request.getAttribute("msg") != null) {
		message = (String) request.getAttribute("msg");
	}
%>

<body>
	<div id=information align="center" style="float: center"">
		<div id="message">
		<% if (message != null) out.print("<span style='text-align: center;'>" + message + "</span>"); %>
		</div>

			<div style="width: 500px; height: 150px;">
				Student listing<br><br>
				<form action="ListServlet" method="get">
					Color of table: <input type="text" name="color" value=""> <br>
					<br> Border of table: <input type="number" name="border"
						value=""> <br> <input type="submit" name="submit"
						value="Submit"> <input type="reset" value="Clear">
				</form>
			</div>
	</div>
	<!--<ex:liststudents color="lightblue" border="1"/>-->

</body>
</html>