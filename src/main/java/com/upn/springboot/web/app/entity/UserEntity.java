package com.upn.springboot.web.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_USER")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 8970352214099005789L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int user_id;
	String userName;
	
	@JoinColumn(name="person_id")
	@OneToOne(cascade=CascadeType.ALL)
	PersonEntity person;
	
	@OneToOne
	RolEntity rol;
	
	@JoinColumn(name="seguridad_id")
	@OneToOne(cascade=CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	SecurityEntity seguridad;

	public UserEntity() {
		super();
	}

	public UserEntity(int user_id, String userName, PersonEntity person, RolEntity rol, SecurityEntity seguridad) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.person = person;
		this.rol = rol;
		this.seguridad = seguridad;
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

	public RolEntity getRol() {
		return rol;
	}

	public void setRol(RolEntity rol) {
		this.rol = rol;
	}

	public SecurityEntity getSeguridad() {
		return seguridad;
	}

	public void setSeguridad(SecurityEntity seguridad) {
		this.seguridad = seguridad;
	}
	

}
