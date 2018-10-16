package bean;

import dao.StudentHibernateDAO;
import pojo.StudentPojo;

public class DeleteBean {

	public String Delete(StudentPojo sp) {
		// TODO Auto-generated method stub
		String msg = null;
		if(sp.getId()== 0) {
			msg = "please check the ID again";
		}
		else StudentHibernateDAO.deleteStudent(sp);
		
		return msg;
	}

}
