<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.ListPojo"%>
<%@ page import="java.util.*"%>
<%@ page import="dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing</title>
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
	<div id=information style="float: center">
		<center>
			<%
				List<StudentHibernateEntity> result = StudentHibernateDAO.ListUser();
			%>
			<div style="width: 500px; border: 1px solid #000;">
				<center>
					Student Listing <br>
					<style>
tr:nth-child(even) td {
	background-color: <%=request.getParameter("color")%>
}
</style>
					<table border=<%=request.getParameter("border")%>>
						<tr>
							<th>Student ID</th>
							<th>Student Name</th>
							<th>Student Contact</th>
						</tr>
						
						<%
							for (StudentHibernateEntity s : result) {
							
							out.println("<tr><td>"+s.getId()+"</td><td>"+s.getName()+"</td><td>"+s.getContact()+"</td></tr>");
							}
						%>
					
					</table>
					<br>
			</div>
	</div>
	<!--<ex:liststudents color="lightblue" border="1"/>-->

</body>
</html>