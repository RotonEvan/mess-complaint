package com.stnt2.simplifiers.messComplaints.dto;

public class User {
	
	private Integer user_pk;
	private String user_id;
	private String user_name;
	private String password;
	
	public User (Integer user_pk, String user_id, String user_name, String password) {
		this.user_pk = user_pk;
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUser_pk() {
		return user_pk;
	}
	
	public void setUser_pk(Integer user_pk) {
		this.user_pk = user_pk;
	}
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
