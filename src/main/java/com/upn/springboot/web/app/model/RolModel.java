package com.upn.springboot.web.app.model;

public class RolModel {
	
	String name;
	String descriptions;
	int  status;

	public RolModel() {

	}
	
	public RolModel(String name, String descriptions, int status) {
		super();
		this.name = name;
		this.descriptions = descriptions;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
