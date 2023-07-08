package com.upn.springboot.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.NivelesEntity;
import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.model.TypingModel;
import com.upn.springboot.web.app.service.NivelService;
import com.upn.springboot.web.app.service.TypificacionService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("nivel")
public class NivelesController {
	
	@Autowired 
	private NivelService nivelesService;

	
	@GetMapping("/list")
	public ResponseEntity<ResEntity<NivelesEntity>> paramList() {
		ResEntity<NivelesEntity> response = new ResEntity<>();
		try {
			response.setList(nivelesService.getAll());
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
	
	@PostMapping("/list")
	public ResponseEntity<Iterable<NivelesEntity>> listFilter(@RequestBody NivelesEntity typingModel) {
		System.out.println("NIVEL "+typingModel.getNivel());
	    return ResponseEntity.ok(nivelesService.findAllTyping(typingModel));
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<ResEntity<NivelesEntity>> save(@RequestBody NivelesEntity typingEntity) {
		
		ResEntity<NivelesEntity> response = new ResEntity<>();
		System.out.println(typingEntity);
		try {
			nivelesService.save(typingEntity);
			response.setCode("200");
			response.setMessage("SUCCES");
			response.setStatus(true);
			response.setData(typingEntity);
		} catch (Exception e) {
			response.setCode("99");
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
		return ResponseEntity.ok(response);
		
	}
	
	@PostMapping("/delete")
	public ResponseEntity<ResEntity<TipificacionEntity>> delete(@RequestBody TypingModel typingModel) {
		ResEntity<TipificacionEntity> response = new ResEntity<>();
		try {
			//typificacionService.delteFromId(typingModel);
			response.setCode("200");
			response.setMessage("SUCCES");
			response.setStatus(true);;
		} catch (Exception e) {
			response.setCode("99");
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
		
	    return ResponseEntity.ok(response);
		
	}
	
}
