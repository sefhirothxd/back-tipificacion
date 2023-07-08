package com.upn.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upn.springboot.web.app.entity.CallTypingEntity;
import com.upn.springboot.web.app.interfaces.IService;
import com.upn.springboot.web.app.repository.CallTypingRepository;

@Service
public class CallTypingService implements IService<CallTypingEntity>{
	
	@Autowired
	private CallTypingRepository callTypingRepository;
	
	public CallTypingEntity findByIdInteger(Integer code) {
		return callTypingRepository.findByIdInteger(code);
	}

	public List<CallTypingEntity> getList(){
		return callTypingRepository.findAll();
	}
	
	@Override
	public void save(CallTypingEntity entity) {
		
		callTypingRepository.save(entity);
		
	}


	public void delete(Integer id) {
		callTypingRepository.deleteByCustomId(id);
		
	}

	@Override
	public Optional<CallTypingEntity> findById(Long id) {
		return callTypingRepository.findById(id);
	}

	@Override
	public List<CallTypingEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delte(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
