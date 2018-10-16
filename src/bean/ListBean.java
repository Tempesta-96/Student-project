package bean;

import java.util.List;

import dao.StudentHibernateDAO;
import dao.StudentHibernateEntity;
import pojo.ListPojo;

public class ListBean {

	public List Listing(ListPojo lp) {
		// TODO Auto-generated method stub
		
			List<StudentHibernateEntity> result = StudentHibernateDAO.ListUser();
			System.out.println(result);
		return result;	
		
	}

}
