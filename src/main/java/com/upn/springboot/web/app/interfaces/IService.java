package com.upn.springboot.web.app.interfaces;

import java.util.List;
import java.util.Optional;



public interface IService<T> {
	
	public List<T> findAll();
	public Optional<T> findById(Long id);
	public void save(T entity);
	public void delte(String id);

}
