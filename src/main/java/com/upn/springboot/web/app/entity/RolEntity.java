package com.upn.springboot.web.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ROL")
public class RolEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rol_id;
	String name;
	String descripcion;
	String state;
	
	public RolEntity() {
	}

	public RolEntity(int rol_id, String name, String descripcion, String state) {
		super();
		this.rol_id = rol_id;
		this.name = name;
		this.descripcion = descripcion;
		this.state = state;
	}

	public int getRol_id() {
		return rol_id;
	}

	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String isState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}	


}
