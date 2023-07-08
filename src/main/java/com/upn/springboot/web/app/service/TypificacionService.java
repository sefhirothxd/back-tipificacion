package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.model.TypingModel;
import com.upn.springboot.web.app.repository.TypingRepository;

@Service
public class TypificacionService implements IService<TipificacionEntity>{
	
	@Autowired
	private TypingRepository typingRepository;
	
	public List<TipificacionEntity> getAll(){
		return typingRepository.findAll();
	}
	
	public Optional<TipificacionEntity> findById(Long id){
		return typingRepository.findById(id);
	}
	
	public Iterable<TipificacionEntity> findAllTyping(TypingModel typingModel) {
		System.out.println(typingModel.getNivel());
		return typingRepository.findAllTyping(typingModel.getId(), typingModel.getNivel()+"");
	}
	
	public List<TipificacionEntity> getListFilter(String nivel, String titulo) {
	    List<TipificacionEntity> resultList = typingRepository.findByNivelAndTituloCustom(nivel, titulo);
	     return resultList;
	}
	
	@Override
	public void save(TipificacionEntity entity) {
		
		typingRepository.save(entity);
		
	}

	@Override
	public List<TipificacionEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delteFromId(Integer typingID) {
		//Long longCode = Long.valueOf(typingID);
		typingRepository.deleteByCustomId(typingID);
		
		
	}
	

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
