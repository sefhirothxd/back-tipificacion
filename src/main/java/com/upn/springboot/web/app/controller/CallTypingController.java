package com.upn.springboot.web.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.entity.CallTypingEntity;
import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.model.ClienteModel;
import com.upn.springboot.web.app.service.CallTypingService;
import com.upn.springboot.web.app.service.ClienteService;
import com.upn.springboot.web.app.service.TypificacionService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("call")
public class CallTypingController {
	
	@Autowired 
	private CallTypingService callTypingService;


	@GetMapping("/list")
	public ResponseEntity<List<CallTypingEntity>> paramList() {
		
	return ResponseEntity.ok(callTypingService.getList());
		
	}
		
	@PostMapping("/save")
	public ResponseEntity<ResEntity<CallTypingEntity>> save(@RequestBody CallTypingEntity entity) {
		ResEntity<CallTypingEntity> response = new ResEntity<>();
		try {
			callTypingService.save(entity);
			response.setCode("200");
			response.setMessage("SUCCES");
			response.setStatus(true);
			response.setData(entity);
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
			
			callTypingService.delete(code);
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
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<ResEntity<CallTypingEntity>> update(@PathVariable("id") Integer id, @RequestBody CallTypingEntity updatedEntity) {
	    ResEntity<CallTypingEntity> response = new ResEntity<>();
	    try {
	        CallTypingEntity existingEntity = callTypingService.findByIdInteger(id);
	        if (existingEntity == null) {
	            response.setCode("404");
	            response.setStatus(false);
	            response.setMessage("Entity not found");
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	        }

	        if (updatedEntity.getNivel() != null) {
	            existingEntity.setNivel(updatedEntity.getNivel());
	        }
	        if (updatedEntity.getDescription() != null) {
	            existingEntity.setDescription(updatedEntity.getDescription());
	        }

	        callTypingService.save(existingEntity);

	        response.setCode("200");
	        response.setMessage("SUCCESS");
	        response.setStatus(true);
	        response.setData(existingEntity);
	    } catch (Exception e) {
	        response.setCode("99");
	        response.setStatus(false);
	        response.setMessage(e.getMessage());
	    }
	    return ResponseEntity.ok(response);
	}

	
	
}
