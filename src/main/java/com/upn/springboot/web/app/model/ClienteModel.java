package com.upn.springboot.web.app.model;

public class ClienteModel {
	
	String clienteName;
	String document;

	public ClienteModel() {

	}

	public ClienteModel(String clienteName, String document) {
		super();
		this.clienteName = clienteName;
		this.document = document;
	}

	public String getClienteName() {
		return clienteName;
	}

	public void setClienteName(String clienteName) {
		this.clienteName = clienteName;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
	

}
