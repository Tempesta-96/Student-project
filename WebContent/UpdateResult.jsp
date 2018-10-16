<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.StudentPojo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
</head>
<%
	HttpSession sess = request.getSession(false);
	if (sess == null) {
		session.setAttribute("msg", "You are not sign in.");
		RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
		rd.forward(request, response);
	}
%>
<body>
	<div id=information style="float: center">
		<center>
			<h1>
				<%
					StudentPojo sp = (StudentPojo)request.getAttribute("success");
					int id = sp.getId();
					String name  = sp.getName();
					String contact = sp.getContact();
				%>
			</h1>
			<div style="width: 500px; height: 500px; border: 1px solid #000;">
				Update Student<br>
				<br>
				<h1>
				Updated details are: <br>
				Student ID : <%=id%> <br>
				Student Name : <%=name%> <br>
				Student Contact : <%=contact %><br></h1>
				<br>
				Click <a href="Update.jsp">here</a> to update another user.
				<br>
				Click <a href="Home.jsp">here</a> to go home page.
				
			</div>
	</div>

</body>
</html>