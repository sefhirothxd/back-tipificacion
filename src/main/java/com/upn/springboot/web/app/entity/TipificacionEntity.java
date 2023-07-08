package com.upn.springboot.web.app.entity;

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
import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name="TB_TYPING")
public class TipificacionEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int typing_id;
	String titulo;
	String descripcion;
	String nivel;
	
	@JoinColumn(name="padre",referencedColumnName = "typing_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties("typingHijo")
	TipificacionEntity padre;
	
	@OneToMany(mappedBy = "padre", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	List<TipificacionEntity> typingHijo;
	
	
	public TipificacionEntity() {
	}

	public TipificacionEntity(int typing_id, String titulo, String descripcion, String nivel,
			TipificacionEntity padre) {
		super();
		this.typing_id = typing_id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.nivel = nivel;
		this.padre = padre;
	}
	
	public List<TipificacionEntity> getTypingHijo() {
		return typingHijo;
	}

	public void setTypingHijo(List<TipificacionEntity> typingHijo) {
		this.typingHijo = typingHijo;
	}

	public int getTyping_id() {
		return typing_id;
	}

	public void setTyping_id(int typing_id) {
		this.typing_id = typing_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public TipificacionEntity getPadre() {
		return padre;
	}

	public void setPadre(TipificacionEntity padre) {
		this.padre = padre;
	}
	
}
