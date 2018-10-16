package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import bean.ListBean;
import pojo.ListPojo;
import pojo.StudentPojo;


@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String border = request.getParameter("border");
		String color = request.getParameter("color");
		
		String[] beansXMLFiles = new String[] {  "C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans-aspect.xml", 
				"C:/Users/725723/eclipse-workspace/StudentProject/WebContent/WEB-INF/classes/beans.xml"  };
		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
		ListBean bean = (ListBean) context.getBean("list");
		
		StudentPojo sp = new StudentPojo();
		
		ListPojo lp = new ListPojo();
		lp.setBorder(border);
		lp.setColor(color);
		
		List<ListPojo> msg;
		msg = bean.Listing(lp);
		if (msg != null) {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("ListingResult.jsp");
			rd.forward(request, response);

		} else {
			// sp.getId();
			request.setAttribute("data", msg);
			RequestDispatcher rd = request.getRequestDispatcher("ListingResult.jsp");
			rd.forward(request, response);
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


}
