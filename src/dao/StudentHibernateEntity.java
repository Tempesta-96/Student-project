package dao;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import pojo.StudentPojo;

@Entity
@Table(name = "StudentTable")
public class StudentHibernateEntity {
	@Id
	@Column(name = "studID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	public StudentHibernateEntity() {
		super();
	}

	@Column(name = "contact")
	private String contact;

	

	public StudentHibernateEntity(StudentPojo sp) {
		
		this.name =sp.getName();
		this.id = sp.getId();
		this.contact = sp.getContact();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
