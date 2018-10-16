package pojo;

import java.util.List;

import dao.StudentHibernateEntity;

public class ListPojo {
	private String border;
	private String color;
	private String name;
	private String contact;
	private int id;
	
	private List<ListPojo> result;
	
	public ListPojo() {
	}
	
	public ListPojo(StudentHibernateEntity ent) {
		this.id = ent.getId();
		this.name = ent.getName();
		this.contact = ent.getContact();
	}

	public List<ListPojo> getResult() {
		return result;
	}

	public void setResult(List<ListPojo> result) {
		this.result = result;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
