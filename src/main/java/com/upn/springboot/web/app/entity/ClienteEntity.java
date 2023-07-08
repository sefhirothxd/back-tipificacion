package com.upn.springboot.web.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
public class ClienteEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_cliente;
	String fecha_registro;
	
	@JoinColumn(name="person_id")
	@OneToOne(cascade=CascadeType.ALL)
	PersonEntity person;
	


	public ClienteEntity() {
		super();
	}



	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}



	public String getFecha_registro() {
		return fecha_registro;
	}



	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}



	public PersonEntity getPerson() {
		return person;
	}



	public void setPerson(PersonEntity person) {
		this.person = person;
	}
	
	


}
