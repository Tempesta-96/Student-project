package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.SignInPojo;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init() {
		System.out.println("Starting");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("SigninServlet").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p = response.getWriter();		
		HttpSession sess=request.getSession(false);
		if (sess==null) {
			p.println("<a href=\"Start.jsp\"> go back home</a>");
		}else {
			SignInPojo sip = new SignInPojo();
			SignInPojo data = (SignInPojo) sess.getAttribute("data");
			String name = (String) sip.getName();
			System.out.println(name);
			System.out.println(data);
		p.println("<head>"+
				"<link rel='stylesheet' type='text/css' href='resource/skins.css'>"+
				"</head>"+
				"<div id =\"header\">\r\n" + 
				"\r\n" + 
				"	<div id =\"button\" style=\"float:left\">\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  	</div>\r\n" + 
				"  	<p align = \"center\" style=\"float:center\"><h1><center><a href=\"Home.jsp\">WELCOME HOME " +name+"</a></center></h1></p>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div id =\"container\">\r\n" + 
				"	<div id =\"sidebar\">\r\n" + 
				"  	<p align= \"left\" style=\"float:left\">\r\n" + 
				"  	\r\n" + 
				"	<ul>"+ 
					"	<li><a href=\"delete.jsp\" target=\"framing\">Delete me</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"update.jsp\" target=\"framing\">Update me</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"aboutme.html\" target=\"framing\">About me</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"Listing.jsp\" target=\"framing\">List me</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"education.html\" target=\"framing\">Education</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"hobbies.html\" target=\"framing\">Hobbies</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"contactme.html\" target=\"framing\">Contact Me</a></li>\r\n" + 
					"	<br>\r\n" + 
					"	<li><a href=\"LogoutServlet\" target=\"framing\">Logout</a></li>\r\n" + 
					"	<br>"+ 
				" 	</ul>" +
				"	</p>\r\n" + 
				"	</div>\r\n" + 
				"	\r\n" + 
				"	<div id =\"frame\">\r\n" + 
				"	<iframe id=\"ff\" name=\"framing\"></iframe>\r\n" + 
				"	</div>\r\n" + 
				"	\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"</body>");
		
		}
	}
	
	public void destroy() {
		System.out.println("closing");
	}
}
