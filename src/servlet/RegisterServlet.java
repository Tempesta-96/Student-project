package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import bean.RegisterBean;
import pojo.StudentPojo;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String contact = request.getParameter("id");
		
		String[] beansXMLFiles = new String[] {  "C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans-aspect.xml", 
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans.xml" };
		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
		
		RegisterBean bean = (RegisterBean) context.getBean("register");
		
		StudentPojo sp = new StudentPojo();
		sp.setName(name);
		sp.setContact(contact);

		String msg = null;
		msg = bean.register(sp);
		if (msg != null) {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);

		} else {
			request.setAttribute("data", sp);
			RequestDispatcher rd = request.getRequestDispatcher("RegisterResult.jsp");
			rd.forward(request, response);
			
		}

	}

}
