package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.ProductoEntity;
import com.upn.springboot.web.app.entity.RolEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.repository.ProductoRepository;
import com.upn.springboot.web.app.repository.RolRepository;

@Service
public class ProductoService implements IService<ProductoEntity> {
	
	@Autowired
	private ProductoRepository rolRepository;
	
	
	@Override
	public List<ProductoEntity> findAll() {
		return rolRepository.findAll();
	}


	@Override
	public void save(ProductoEntity entity) {
		
		rolRepository.save(entity);
		
	}

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Optional<ProductoEntity> findById(Long id) {
		return rolRepository.findById(id);
	}


}
