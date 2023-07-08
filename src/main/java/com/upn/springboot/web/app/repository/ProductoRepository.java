package com.upn.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upn.springboot.web.app.entity.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

}
