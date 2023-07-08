package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.RolEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.repository.RolRepository;

@Service
public class RolService implements IService<RolEntity> {
	
	@Autowired
	private RolRepository rolRepository;
	
	
	@Override
	public List<RolEntity> findAll() {
		return rolRepository.findAll();
	}


	@Override
	public void save(RolEntity entity) {
		
		rolRepository.save(entity);
		
	}

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Optional<RolEntity> findById(Long id) {
		return rolRepository.findById(id);
	}


}
