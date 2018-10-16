package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.SignInBean;
import bean.UpdateBean;
import pojo.StudentPojo;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id  = Integer.parseInt(request.getParameter("id"));
		String contact = request.getParameter("contact");
		String name = request.getParameter("name");
		
		String[] beansXMLFiles = new String[] {  "C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans-aspect.xml", 
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans.xml"  };
		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
		UpdateBean bean = (UpdateBean) context.getBean("Update");
		
		StudentPojo sp = new StudentPojo();
		sp.setId(id);
		sp.setName(name);
		sp.setContact(contact);
		String msg = "";
		msg = bean.Update(sp);
		
		if (msg.contains("check")) {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
			rd.forward(request, response);
		}
		else if (msg.contains("update")){
			request.setAttribute("update", sp);
			RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
			rd.forward(request, response);
		}
		else if (msg.contains("success")){
			request.setAttribute("success", sp);
			RequestDispatcher rd = request.getRequestDispatcher("UpdateResult.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
