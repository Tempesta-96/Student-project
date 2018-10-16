<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.*"%>
<%@ page import="pojo.StudentPojo"%>
<%@ page import="pojo.SignInPojo"%>
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' type='text/css' href='resource/skins.css'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Welcome home</title>
</head>


<body>
	<div id="header">

		<div id="button">
			<div align="center" style="float: center">
				<h1>
					<a href="Home.jsp">WELCOME HOME</a>
					<%
						HttpSession sess = request.getSession(false);
						if (sess == null) {
							response.sendRedirect("SignIn.jsp");
						} else if (session.getAttribute("data") == null) {
							response.sendRedirect("SignIn.jsp");
						} else if (session.getAttribute("data") != null) {
							((SignInPojo) session.getAttribute("data")).getName();
						}
					%>

				</h1>
			</div>
		</div>


	</div>

	<div id="container">
		<div id="sidebar" class="col-sm-4">
			<div style="align-content: left;" style="float: left">
				<ul>
					<li><a href="Add.jsp" target="framing">Add student</a></li>
					<br>
					<li><a href="Delete.jsp" target="framing">Delete me</a></li>
					<br>
					<li><a href="Listing.jsp" target="framing">List me</a></li>
					<br>

				</ul>
			</div>
		</div>

		<div id="frame" style="align-content: right;" class="col-sm-8">
			<iframe id="ff" name="framing"></iframe>
		</div>
	</div>
	<div id="blown">
		<center>

			<img src="https://media.giphy.com/media/xT0xeJpnrWC4XWblEk/giphy.gif" />
			<img
				src="https://ih0.redbubble.net/image.218547668.2032/ap,550x550,16x12,1,transparent,t.png" />
		</center>
	</div>

</body>
</html>