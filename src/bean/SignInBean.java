package bean;

import dao.StudentHibernateDAO;
import pojo.SignInPojo;

public class SignInBean {

	public String SignIn(SignInPojo sip) {
		// TODO Auto-generated method stub

		String msg = null;

		if (sip.getName().equals("") || sip.getId() == 0) {
			msg = "Name and ID cannot be null";
		} else {
			if (StudentHibernateDAO.validateUser(sip)== true) {
				msg = "true";
			}
			else msg = "false";
		}
		return msg;
	}

}
