package com.upn.springboot.web.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SECURITY")
public class SecurityEntity implements Serializable{

	private static final long serialVersionUID = 3778842607855785885L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int seguridad_id;
	String pass;
	String token;
	String fechaCreacion;
	String fechaModifiacaion;
	
	public SecurityEntity() {
		super();
	}

	public SecurityEntity(int seguridad_id, String pass, String token, String fechaCreacion, String fechaModifiacaion) {
		super();
		this.seguridad_id = seguridad_id;
		this.pass = pass;
		this.token = token;
		this.fechaCreacion = fechaCreacion;
		this.fechaModifiacaion = fechaModifiacaion;
	}



	public int getSeguridad_id() {
		return seguridad_id;
	}

	public void setSeguridad_id(int seguridad_id) {
		this.seguridad_id = seguridad_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaModifiacaion() {
		return fechaModifiacaion;
	}

	public void setFechaModifiacaion(String fechaModifiacaion) {
		this.fechaModifiacaion = fechaModifiacaion;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
