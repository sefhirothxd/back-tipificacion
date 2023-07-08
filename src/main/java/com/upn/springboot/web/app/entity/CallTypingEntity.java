package com.upn.springboot.web.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="TB_CALLTYPING")
public class CallTypingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int call_id;

	@OneToOne
	@JoinColumn(name = "nivel_id")
	NivelesEntity nivel;

	@OneToOne
	@JoinColumn(name = "id_cliente")
	ClienteEntity cliente;

	String description;


	public CallTypingEntity() {
		super();
	}

	public CallTypingEntity(int call_id, NivelesEntity nivel, ClienteEntity cliente, String description) {
		this.call_id = call_id;
		this.nivel = nivel;
		this.cliente = cliente;
		this.description = description;
	}

	public int getCall_id() {
		return call_id;
	}

	public void setCall_id(int call_id) {
		this.call_id = call_id;
	}

	public NivelesEntity getNivel() {
		return nivel;
	}

	public void setNivel(NivelesEntity nivel) {
		this.nivel = nivel;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}