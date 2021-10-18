package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "details about the user")
@Entity
public class User {
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Id
	@ApiModelProperty(notes = "name must be unique")
	private String name;
	@ApiModelProperty(notes = "use strong password")
	private String pass;
	private String email;
	private String city;
	private String department;
	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", email=" + email + ", city=" + city + ", department="
				+ department + "]";
	}
	public User(String name, String pass, String email, String city, String department) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.city = city;
		this.department = department;
	}
	
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
		
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

}
