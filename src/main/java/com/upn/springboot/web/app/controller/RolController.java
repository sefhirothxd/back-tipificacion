package com.upn.springboot.web.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.RolEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.model.RolModel;
import com.upn.springboot.web.app.service.RolService;
import com.upn.springboot.web.app.service.TypificacionService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("rol")
public class RolController {
	
	@Autowired 
	private RolService rolService;

	
	@GetMapping("/list")
	public ResponseEntity<ResEntity<RolEntity>> list() {
		ResEntity<RolEntity> response = new ResEntity<>();
		try {
		response.setList(rolService.findAll());
		response.setCode("200");
		response.setMessage("SUCCES");
		response.setStatus(true);
		return ResponseEntity.ok(response);
	} catch (Exception e) {
		
		response.setCode("99");
		response.setMessage("ERROR"+e);
		response.setStatus(false);
		return ResponseEntity.ok(response);
	}
		
	}
	
	@PostMapping("/save-rol")
	public ResponseEntity<ResEntity<RolEntity>> save(@RequestBody RolEntity rolModel) {
		
		ResEntity<RolEntity> response = new ResEntity<>();
		//RolEntity rol = new RolEntity();
		
		//rol.setDescripcion(rolModel.getDescriptions());
		//rol.setName(rolModel.getName());
		//rol.setState(true);
		
		rolService.save(rolModel);
		
		response.setCode("200");
		response.setMessage("SUCCES");
		response.setData(rolModel);
		
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping("/getid/{id]")
	public ResponseEntity<Optional<RolEntity>> getTyping(@PathVariable Long id) {
		
	return ResponseEntity.ok(rolService.findById(id));
		
	}

	
}
