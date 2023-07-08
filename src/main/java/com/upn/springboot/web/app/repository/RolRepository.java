package com.upn.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upn.springboot.web.app.entity.RolEntity;

public interface RolRepository extends JpaRepository<RolEntity, Long> {

}
