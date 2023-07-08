package com.upn.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;


@RestController
@RequestMapping("index")
public class ApiController {

	@GetMapping("/hola")
	public String login() {
		return "HOLA METODO";
	
	}
	
	@GetMapping("/typificaciones")
	public ResEntity<TipificacionEntity> param() {
		
	
		List<TipificacionEntity> ty ;
		ty = new ArrayList<>();
		ResEntity<TipificacionEntity> data;

		
		data = new ResEntity<>();
		data.setCode("200");
		data.setStatus(true);
		data.setMessage("Login correcto");
		data.setList(ty);
		
		return data;
		
	}

	
}
