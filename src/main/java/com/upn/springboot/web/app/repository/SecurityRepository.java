package com.upn.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upn.springboot.web.app.entity.SecurityEntity;

public interface SecurityRepository extends JpaRepository<SecurityEntity, Long> {
	
	

}
