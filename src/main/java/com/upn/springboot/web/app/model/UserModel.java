package com.upn.springboot.web.app.model;

public class UserModel {
	
	String userName;
	String document;

	public UserModel() {

	}

	public UserModel(String userName, String document) {
		super();
		this.userName = userName;
		this.document = document;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
	

}
