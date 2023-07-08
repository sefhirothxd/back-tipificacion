package com.upn.springboot.web.app.dto;

import java.io.Serializable;

import com.upn.springboot.web.app.entity.PersonEntity;
import com.upn.springboot.web.app.entity.UserEntity;

public class UserDto implements Serializable{
	
	private static final long serialVersionUID = 8970352214099005789L;
	int user_id;
	String userName;
	PersonEntity person;
	String rolId;
	String securityId;
	
	
	
	public UserDto() {
		
	}


	public UserDto(int user_id, String userName, PersonEntity person, String rolId, String securityId) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.person = person;
		this.rolId = rolId;
		this.securityId = securityId;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public PersonEntity getPerson() {
		return person;
	}


	public void setPerson(PersonEntity person) {
		this.person = person;
	}


	public String getRolId() {
		return rolId;
	}


	public void setRolId(String rolId) {
		this.rolId = rolId;
	}


	public String getSecurityId() {
		return securityId;
	}


	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void maperDto(UserEntity user) {
		this.user_id = user.getUser_id();
		this.userName = user.getUserName();
		this.person = user.getPerson();
		this.rolId = user.getRol().getRol_id()+"";
		this.securityId = user.getSeguridad().getSeguridad_id()+"";
	}
	
	
}
