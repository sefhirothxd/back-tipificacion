package com.upn.springboot.web.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.upn.springboot.web.app.entity.TipificacionEntity;

public interface TypingRepository extends JpaRepository<TipificacionEntity, Long> {

	@Modifying
	@Transactional(readOnly = true)
	//@Query(value = "SELECT t FROM TipificacionEntity t WHERE t.padre = :padre AND t.nivel = :nivel")
	@Query(value = "SELECT * FROM TB_TYPING t WHERE t.padre = :typing_id AND t.nivel = :nivel",nativeQuery=true)
	List<TipificacionEntity> findAllTyping(@Param(value = "typing_id") int typing_id, @Param(value = "nivel") String nivel);
	//List<TipificacionEntity> findAllTyping(@Param(value = "padre") TipificacionEntity padre,@Param(value = "nivel") String nivel);
	

	 @Modifying
	 @Transactional
	 @Query("DELETE FROM TipificacionEntity t WHERE t.id = :id")
	 void deleteByCustomId(@Param("id") Integer id);
	 
	 

		@Modifying
		@Transactional(readOnly = true)
		@Query(value = "SELECT * FROM tb_typing tt WHERE tt.nivel = :nivel OR tt.titulo = :titulo", nativeQuery = true)
		List<TipificacionEntity> findByNivelAndTituloCustom(@Param(value = "nivel") String nivel, @Param(value = "titulo") String titulo);

}
