package com.upn.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.entity.UserLogin;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("auth")
public class LoginController {

	
	@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
	public ResEntity<UserLogin> login(@RequestBody UserLogin usuario) {
		System.out.println(usuario.getPass());
		ResEntity<UserLogin> data;
		UserLogin user = new UserLogin();
		
		user.setUserName(usuario.getUserName());
		user.setToken("9x8869x31134x7906x6x54474x21x18xxx90857x");
		
		data = new ResEntity<>();
		data.setCode("200");
		data.setStatus(true);
		data.setData(user);
		data.setMessage("Login correcto");
		
		return data;
		
	}

	
}
