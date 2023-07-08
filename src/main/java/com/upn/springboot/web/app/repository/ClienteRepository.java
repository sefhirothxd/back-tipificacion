package com.upn.springboot.web.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.upn.springboot.web.app.entity.ClienteEntity;
import com.upn.springboot.web.app.entity.UserEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
	
	@Query(value = "SELECT c FROM ClienteEntity c INNER JOIN PersonEntity p  ON c.person = p.person_id  WHERE p.name LIKE %:name%")
	List<ClienteEntity> findAllCliente(@Param(value = "name") String name);
	
}
