package com.stnt2.simplifiers.messComplaints.dto;

public class ComplaintDTO {
	
	private Integer complaint_pk;
	private String complaint_id;
	private String complaint_description;
	private String meal;
	private Integer user_pk;
	private String name;
	private String id;
	private String mess;
	private Integer mess_pk;
	private String date;
	
	public ComplaintDTO (Integer complaint_pk, String complaint_id, String complaint_description, String name, String id, String mess, String meal, Integer user_pk,Integer mess_pk,String date) {
		this.complaint_pk = complaint_pk;
		this.complaint_id = complaint_id;
		this.user_pk = user_pk;
		this.mess_pk = mess_pk;
		this.complaint_description = complaint_description;
		this.meal = meal;
		this.date = date;
		this.name = name;
		this.id = id;
		this.mess = mess;
	}
	
	public ComplaintDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getcomplaint_pk() {
		return complaint_pk;
	}
	
	public void setcomplaint_pk(Integer complaint_pk) {
		this.complaint_pk = complaint_pk;
	}
	public Integer getuser_pk() {
		return user_pk;
	}
	
	public void setuser_pk(Integer user_pk) {
		this.user_pk = user_pk;
	}
	public Integer getmess_pk() {
		return mess_pk;
	}
	
	public void setmess_pk(Integer mess_pk) {
		this.mess_pk = mess_pk;
	}
	
	public String getcomplaint_id() {
		return complaint_id;
	}
	
	public void setcomplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	
	public String getcomplaint_description() {
		return complaint_description;
	}
	
	public void setcomplaint_description(String complaint_description) {
		this.complaint_description = complaint_description;
	}
	
	public String getmeal() {
		return meal;
	}
	
	public void setmeal(String meal) {
		this.meal = meal;
	}
	public String getdate(){
		return date;
	}
	public void setdate(String date){
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMess() {
		return mess;
	}
	public void setMess(String mess) {
		this.mess = mess;
	}

}
