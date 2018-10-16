package bean;

import dao.StudentHibernateDAO;
import pojo.StudentPojo;

public class RegisterBean {

	public String register(StudentPojo sp) {
		// TODO Auto-generated method stub
		String msg =null;
		
		if(sp.getName().equals("") || sp.getContact().equals("")) {
			msg = "Name and contact cannot be null";
		}
		else {
			StudentPojo stud = StudentHibernateDAO.addStudent(sp);
		}
		return msg;
	}
}
