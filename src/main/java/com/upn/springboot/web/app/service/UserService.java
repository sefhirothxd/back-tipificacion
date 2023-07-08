package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.RolEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.entity.UserEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.repository.TypingRepository;
import com.upn.springboot.web.app.repository.UserRepository;

@Service
public class UserService implements IService<UserEntity> {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserEntity> getList(){
		return userRepository.findAll();
	}
	
	@Override
	public void save(UserEntity entity) {
		
		userRepository.save(entity);
		
	}

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UserEntity> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Iterable<UserEntity> findAllUser(UserEntity user) {
		System.out.println(user);
		return userRepository.findAllUsers(user.getUserName());
		//return null;
		
	}

}
