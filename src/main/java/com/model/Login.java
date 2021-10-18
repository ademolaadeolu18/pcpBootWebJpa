package com.model;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "details about the user")
public class Login {
	@NotEmpty
	@ApiModelProperty(notes = "name must be in the database")
	private  String uname;
	@ApiModelProperty(notes = "password must match the one in the database")
	private String upassword;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String uname, String upassword) {
		super();
		this.uname = uname;
		this.upassword = upassword;
	}

}
