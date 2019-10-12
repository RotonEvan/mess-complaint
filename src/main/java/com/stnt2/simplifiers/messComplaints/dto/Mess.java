package com.stnt2.simplifiers.messComplaints.dto;

public class Mess {
	
	private Integer mess_pk;
	private String mess_id;
	private String mess_name;
	private String password;
	
	public Mess (Integer mess_pk, String mess_id, String mess_name, String password) {
		this.mess_pk = mess_pk;
		this.mess_id = mess_id;
		this.mess_name = mess_name;
		this.password = password;
	}
	
	public Mess() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getMess_pk() {
		return mess_pk;
	}
	
	public void setMess_pk(Integer mess_pk) {
		this.mess_pk = mess_pk;
	}
	
	public String getMess_id() {
		return mess_id;
	}
	
	public void setMess_id(String mess_id) {
		this.mess_id = mess_id;
	}
	
	public String getMess_name() {
		return mess_name;
	}
	
	public void setMess_name(String mess_name) {
		this.mess_name = mess_name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
