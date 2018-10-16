package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.SignInBean;
import pojo.SignInPojo;

@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));

		String[] beansXMLFiles = new String[] {
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans-aspect.xml",
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans.xml" };

		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
		SignInBean bean = (SignInBean) context.getBean("sign");

		SignInPojo sip = new SignInPojo();
		sip.setName(name);
		sip.setId(id);

		String msg = null;
		msg = bean.SignIn(sip);
		if (msg.contains("null")) {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("SignIn.jsp");
			rd.forward(request, response);

		} else if (msg.contains("false")) {
			request.setAttribute("msg", "Invalid username or student ID");
			RequestDispatcher rd = request.getRequestDispatcher("SignIn.jsp");
			rd.forward(request, response);

		} else if (msg.contains("true")) {
			// sp.getId();
			HttpSession session = request.getSession();
			session.setAttribute("data", sip);
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);

		}

	}

}
