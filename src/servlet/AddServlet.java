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
import bean.AddBean;
import pojo.StudentPojo;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		
		String[] beansXMLFiles = new String[] { "C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans-aspect.xml", 
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans.xml" };
		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
		AddBean bean = (AddBean) context.getBean("add");
		
		StudentPojo sp = new StudentPojo();
		sp.setName(name);
		sp.setContact(contact);

		String msg = "";
		msg = bean.add(sp);
		if (msg != null) {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
			rd.forward(request, response);

		} else {
			request.setAttribute("data", sp);
			RequestDispatcher rd = request.getRequestDispatcher("AddResult.jsp");
			rd.forward(request, response);

		}

	}

}
