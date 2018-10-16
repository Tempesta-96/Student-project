package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.ListPojo;
import pojo.SignInPojo;
import pojo.StudentPojo;

public class StudentHibernateDAO {
	public static StudentPojo addStudent(StudentPojo sp) {
		SessionFactory sf = null;
		Session session = null;
		Transaction tr = null;
		try {
			sf = dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			StudentHibernateEntity stud = new StudentHibernateEntity(sp);
			session.save(stud);
			tr.commit();
			sp.setId(stud.getId());
		} catch (Exception e) {
			System.out.println("Error with insert block");
			tr.rollback();
			session.close();
		}
		return sp;
	}

	public static boolean validateUser(SignInPojo sip) {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		Session session = null;
		List<String> results = new ArrayList<>();
		try {
			sf = dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			String hql = "select s.name from StudentHibernateEntity s where s.id = " + sip.getId();
			List<String> list = session.createQuery(hql).list();
			for (String s : list) {
				if (sip.getName().equals(s)) {
					return true;
				}
				return false;

			}
		} catch (Exception e) {
			System.out.println("Error with validation block");
			e.printStackTrace();
			;
			session.close();
		}
		return false;
	}

	public static void deleteStudent(StudentPojo sp) {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		Session session = null;
		Transaction tr = null;
		try {
			sf = dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			StudentHibernateEntity stud = new StudentHibernateEntity(sp);
			session.delete(stud);
			tr.commit();
		} catch (Exception e) {
			System.out.println("Error with delete");
			System.out.println(e);
		}
	}

	public static void getUpdateStudent(StudentPojo sp) {
		SessionFactory sf = null;
		Session session = null;
//		List<String> results = new ArrayList<>();
		try {
			sf = dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			String hql = "select s.name , s.contact from StudentHibernateEntity s where s.id = " + sp.getId();
			List<String> list = session.createQuery(hql).list();
			for(String s: list) {
				sp.setContact(s);
				sp.setName(s);
			}
		} catch (Exception e) {
			System.out.println("Error with update block");
		}
	}
	
	public static void updateStudent(StudentPojo sp) {
		SessionFactory sf = null;
		Session session = null;
		Transaction tr = null;
		String msg = "";
		try {
			sf = dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			StudentHibernateEntity stud = new StudentHibernateEntity(sp);
			session.saveOrUpdate(stud);
			tr.commit();
		} catch (Exception e) {
			System.out.println("Error with update block");
		}
	}

	public static List<StudentHibernateEntity> ListUser() {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		Session session = null;
//		List<StudentHibernateEntity> results = new ArrayList<>();
//		List<ListPojo> ListPojo = new ArrayList<ListPojo>();
//		
//		try {
//			sf = dao.HibernateUtil.getSessionFactory();
//			session = sf.openSession();
//			System.out.println("session");
//			//Query query = (Query) session.createQuery("from StudentHibernateEntity s");
//			String hql = "from StudentHibernateEntity s";
//			System.out.println(hql);
//			//results = (List<StudentHibernateEntity>) session.createQuery(hql);
//			results = session.createQuery(hql).list();
//			System.out.println("hql create query");
//			for(StudentHibernateEntity se: results) {
//				ListPojo lp = new ListPojo();
//				lp.setId(se.getId());
//				lp.setName(se.getName());
//				lp.setContact(se.getContact());
//				System.out.println("Set information to pojo");
//				ListPojo.add(lp);
//				System.out.println("set information to collection");
//			}
//			return ListPojo;
			List<StudentHibernateEntity> object2 = new ArrayList<StudentHibernateEntity>();		
			try {
				sf = dao.HibernateUtil.getSessionFactory();
				session = sf.openSession();
				String hql = "from StudentHibernateEntity s";
				object2 = session.createQuery(hql).list();
				
			
			} catch (Exception e) {
				System.out.println("Error with Listing block");
				e.printStackTrace();
				session.close();
			}
//			System.out.println(object.size());
			return object2;
	}
}
