package com.upn.springboot.web.app.model;


public class TypingModel {
	

	private int id;
	private String name;
	private int nivel;
	
	public TypingModel() {
		super();
	}


	public TypingModel(int id, String name, int nivel) {
		super();
		this.id = id;
		this.name = name;
		this.nivel = nivel;
	}



	public int getNivel() {
		return nivel;
	}



	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
