package com.upn.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.UserEntity;
import com.upn.springboot.web.app.model.ClienteModel;
import com.upn.springboot.web.app.model.UserModel;
import com.upn.springboot.web.app.service.ClienteService;
import com.upn.springboot.web.app.service.UserService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("customer")
public class ClienteController {
	
	@Autowired 
	private ClienteService clienteService;

	@GetMapping("/list")
	public ResponseEntity<List<ClienteEntity>> paramList() {
		
	return ResponseEntity.ok(clienteService.getList());
		
	}
	
	@PostMapping("/list2")
	public ResponseEntity<Iterable<ClienteEntity>> paramListv2(@RequestBody ClienteModel clienteModel) {
		System.out.println(clienteModel.getClienteName());
	    return ResponseEntity.ok(clienteService.findAllCliente(clienteModel));
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<ResEntity<ClienteEntity>> save(@RequestBody ClienteEntity clienteEntity) {
		
		ResEntity<ClienteEntity> response = new ResEntity<>();
		System.out.println(clienteEntity);
		try {
			clienteService.save(clienteEntity);
			response.setCode("200");
			response.setMessage("SUCCES");
			response.setStatus(true);
			response.setData(clienteEntity);
		} catch (Exception e) {
			response.setCode("99");
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
		return ResponseEntity.ok(response);
		
	}
	
	
}
