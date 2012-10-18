package com.tommy.demo.model;


//@Entity
public class User {

	private int id;
	private String userName;
	private Group group;

	public User() {
	}

	public User(int id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public User(int id, String userName, Group group) {
		this.id = id;
		this.userName = userName;
		this.group = group;
	}

//	@Id
//	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
}
