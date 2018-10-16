package bean;

import java.sql.ResultSet;

import dao.StudentHibernateDAO;
import pojo.StudentPojo;

public class AddBean {

	public String add(StudentPojo sp) {
		// TODO Auto-generated method stub
		String msg =null;
		ResultSet userid;
		
		if(sp.getName().equals("")|| sp.getContact().equals("")) {
			msg = "Name and contact cannot be null";
		}
		else {
			StudentHibernateDAO.addStudent(sp);
		}
		return msg;
	}
}
