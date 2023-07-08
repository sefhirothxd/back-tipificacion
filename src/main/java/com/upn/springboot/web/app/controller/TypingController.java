package com.upn.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.CallTypingEntity;
import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.model.TypingModel;
import com.upn.springboot.web.app.service.TypificacionService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("typing")
public class TypingController {
	
	@Autowired 
	private TypificacionService typificacionService;

	
	@GetMapping("/list")
	public ResponseEntity<ResEntity<TipificacionEntity>> paramList() {
		ResEntity<TipificacionEntity> response = new ResEntity<>();
		try {
			response.setList(typificacionService.getAll());
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
	public ResponseEntity<Iterable<TipificacionEntity>> listFilter(@RequestBody TypingModel typingModel) {
		System.out.println(typingModel.getNivel());
	    return ResponseEntity.ok(typificacionService.findAllTyping(typingModel));
		
	}
	
	@GetMapping("/list2")
	public ResponseEntity<List<TipificacionEntity>> getList(@RequestParam(required = false) String nivel,
	                                                      @RequestParam(required = false) String titulo) {
	    List<TipificacionEntity> list = typificacionService.getListFilter(nivel, titulo);
	    return ResponseEntity.ok(list);
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<ResEntity<TipificacionEntity>> save(@RequestBody TipificacionEntity typingEntity) {
		
		ResEntity<TipificacionEntity> response = new ResEntity<>();
		System.out.println(typingEntity);
		try {
			typificacionService.save(typingEntity);
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
	
	@DeleteMapping("/delete/{code}")
	public ResponseEntity<ResEntity<TipificacionEntity>> delete(@PathVariable("code") Integer code) {
		ResEntity<TipificacionEntity> response = new ResEntity<>();
		try {
			typificacionService.delteFromId(code);
			response.setCode("200");
			response.setMessage("SUCCES");
			response.setStatus(true);
		} catch (Exception e) {
			response.setCode("99");
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
		
	    return ResponseEntity.ok(response);
		
	}
	
}
