package com.upn.springboot.web.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="TB_NIVELES")
public class NivelesEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2222844538884300101L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int nivel_id;
	String titulo;
	int nivel;
	int padre;
	
	
	
	public NivelesEntity() {
		super();
	}
	

	public NivelesEntity(int nivel_id, String titulo, int nivel, int padre) {
		super();
		this.nivel_id = nivel_id;
		this.titulo = titulo;
		this.nivel = nivel;
		this.padre = padre;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getNivel_id() {
		return nivel_id;
	}



	public void setNivel_id(int nivel_id) {
		this.nivel_id = nivel_id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getPadre() {
		return padre;
	}



	public void setPadre(int padre) {
		this.padre = padre;
	}
	
	
	
}
