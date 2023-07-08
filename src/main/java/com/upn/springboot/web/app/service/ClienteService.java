package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.RolEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.entity.UserEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.model.ClienteModel;
import com.upn.springboot.web.app.repository.ClienteRepository;
import com.upn.springboot.web.app.repository.TypingRepository;
import com.upn.springboot.web.app.repository.UserRepository;

@Service
public class ClienteService implements IService<ClienteEntity> {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteEntity> getList(){
		return clienteRepository.findAll();
	}
	
	@Override
	public void save(ClienteEntity entity) {
		
		clienteRepository.save(entity);
		
	}

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ClienteEntity> findById(Long id) {
		return clienteRepository.findById(id);
	}

	@Override
	public List<ClienteEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Iterable<ClienteEntity> findAllCliente(ClienteModel cliente) {
		System.out.println(cliente);
		return clienteRepository.findAllCliente(cliente.getClienteName());
		//return null;
		
	}


}
