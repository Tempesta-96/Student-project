<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="pojo.SignInPojo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
	#home{
		padding-right:100px;
	}
</style>
<link rel='stylesheet' type='text/css' href='resource/skins.css'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
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
				<div id="home"><a href="Start.jsp">HOME</a></div>
			</center>
		</h1>
	</div>

	<div id="container">
		<div id="sidebar">
			<p align="left" style="float: left"></p>
		</div>


	</div>



</body>
</html>