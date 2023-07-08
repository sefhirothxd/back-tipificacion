package com.upn.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.springboot.web.app.dto.UserDto;
import com.upn.springboot.web.app.entity.ResEntity;
import com.upn.springboot.web.app.entity.UserEntity;
import com.upn.springboot.web.app.model.UserModel;
import com.upn.springboot.web.app.service.UserService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("user")
public class UserController {
	
	@Autowired 
	private UserService userService;

	@GetMapping("/list")
	public ResponseEntity<List<UserEntity>> paramList() {
		
	return ResponseEntity.ok(userService.getList());
		
	}
	
	@PostMapping("/list")
	public ResponseEntity<Iterable<UserEntity>> paramListv2(@RequestBody UserModel userModel) {
		System.out.println(userModel.getUserName());
		UserEntity user = new UserEntity();
		
		if(userModel.getUserName() != null || userModel.getUserName() != "") {
			user.setUserName(userModel.getUserName());
		} else {
			user.setUserName(" ");
		}
		
	    return ResponseEntity.ok(userService.findAllUser(user));
		
	}
	
	@GetMapping("/list2")
	public ResponseEntity<Iterable<UserDto>> paramListv3() {
		
		List<UserDto> data = new ArrayList<>();
		 for (UserEntity u : userService.getList()) {
			  	UserDto outUser = new UserDto();
			 	outUser.maperDto(u);
	            data.add(outUser);
	            System.out.println(outUser.getUserName());
	        }
		 
	    return ResponseEntity.ok(data);
		
	}
	
	@PostMapping("/save-user")
	public ResponseEntity<ResEntity<UserEntity>> save(@RequestBody UserEntity userEntity) {
		
		ResEntity<UserEntity> response = new ResEntity<>();
		System.out.println(userEntity);
		try {
			userService.save(userEntity);
			response.setCode("200");
			response.setMessage("SUCCES");
			response.setStatus(true);
			response.setData(userEntity);
		} catch (Exception e) {
			response.setCode("99");
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
		return ResponseEntity.ok(response);
		
	}
	
	
}
