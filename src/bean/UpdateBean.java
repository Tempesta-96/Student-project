package bean;

import dao.StudentHibernateDAO;
import pojo.StudentPojo;

public class UpdateBean {

	public String Update(StudentPojo sp) {
		// TODO Auto-generated method stub
		String msg = null;
		if(sp.getId()==0 || sp.getContact().equals("")|| sp.getName().equals("")) {
			msg = "please check the values";
		}
		else if(sp.getId()!=0){
			StudentHibernateDAO.getUpdateStudent(sp);
			msg ="update";
		}
		else {
			StudentHibernateDAO.updateStudent(sp);
			msg = "success";
		}
		return msg;
	}

}
