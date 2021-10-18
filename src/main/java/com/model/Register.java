package com.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "details about the user")
public class Register {

	@ApiModelProperty(notes = "name must be unique")
	private String uname;
	private String password;
	private String email;
	private String city;
	private String department;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String uname, String password, String email, String city, String department) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.city = city;
		this.department = department;
	}
}
