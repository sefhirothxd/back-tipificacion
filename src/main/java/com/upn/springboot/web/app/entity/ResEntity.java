package com.upn.springboot.web.app.entity;

import java.util.List;

public class ResEntity<T> {
	
	private Boolean status;
	private String code;
	private String message;
	private T data;
	private List<T> list;
	
	public ResEntity() {
	}
	

	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public List<T> getList() {
		return list;
	}


	public void setList(List<T> list) {
		this.list = list;
	}
	
	

}
