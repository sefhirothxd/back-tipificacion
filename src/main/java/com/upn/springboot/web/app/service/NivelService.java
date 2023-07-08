package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.NivelesEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.model.TypingModel;
import com.upn.springboot.web.app.repository.NivelesRepository;
import com.upn.springboot.web.app.repository.TypingRepository;

@Service
public class NivelService implements IService<NivelesEntity>{
	
	@Autowired
	private NivelesRepository nivelesRepository;
	
	public List<NivelesEntity> getAll(){
		return nivelesRepository.findAll();
	}
	
	public Optional<NivelesEntity> findById(Long id){
		return nivelesRepository.findById(id);
	}
	
	public Iterable<NivelesEntity> findAllTyping(NivelesEntity nivelesEntity) {
		return nivelesRepository.findAllTyping(nivelesEntity.getPadre(), nivelesEntity.getNivel());
	}
	
	@Override
	public void save(NivelesEntity entity) {
		
		nivelesRepository.save(entity);
		
	}

	@Override
	public List<NivelesEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delteFromId(TypingModel typing) {
		//typingRepository.deleteById(typing.getId());
		
	}

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
