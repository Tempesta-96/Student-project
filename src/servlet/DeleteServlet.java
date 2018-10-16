package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.DeleteBean;
import pojo.StudentPojo;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id  = Integer.parseInt(request.getParameter("id"));
		String path = "/WEB-INF/classes/beans.xml";
		String[] beansXMLFiles = new String[] {  "C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans-aspect.xml", 
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans.xml"  };
		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
		DeleteBean bean = (DeleteBean) context.getBean("delete");
		
		StudentPojo sp = new StudentPojo();
		sp.setId(id);
		String msg = "";
		msg = bean.Delete(sp);
		if (msg != null) {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("msg", "Records deleted");
			RequestDispatcher rd=  request.getRequestDispatcher("DeleteResult.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
