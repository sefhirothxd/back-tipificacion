package com.upn.springboot.web.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.upn.springboot.web.app.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	@Modifying
	@Query(value = "SELECT u FROM UserEntity u WHERE u.userName LIKE %:name%")
	List<UserEntity> findAllUsers(@Param(value = "name") String name);
	
	
}
