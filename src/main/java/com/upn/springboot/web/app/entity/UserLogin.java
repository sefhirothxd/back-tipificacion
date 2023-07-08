package com.upn.springboot.web.app.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class UserLogin {

	private String userName;
	private String email;
	private String token;
	private String pass;
	
	
	public UserLogin() {
	}

	public UserLogin(String userName, String email, String token, String pass) {
		super();
		this.userName = userName;
		this.email = email;
		this.token = token;
		this.pass = pass;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	

	
	

}

