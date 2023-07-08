package com.upn.springboot.web.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.upn.springboot.web.app.entity.NivelesEntity;
import com.upn.springboot.web.app.entity.TipificacionEntity;

public interface NivelesRepository extends JpaRepository<NivelesEntity, Long> {

	@Modifying
	@Transactional(readOnly = true)
	@Query(value = "SELECT * FROM TB_NIVELES t WHERE t.padre = :id AND t.nivel = :nivel",nativeQuery=true)
	List<NivelesEntity> findAllTyping(@Param(value = "id") int typing_id, @Param(value = "nivel") int nivel);

}
