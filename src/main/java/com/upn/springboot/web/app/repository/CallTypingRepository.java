package com.upn.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.upn.springboot.web.app.entity.CallTypingEntity;

public interface CallTypingRepository extends JpaRepository<CallTypingEntity, Long> {
	
	
	 @Query("SELECT c FROM CallTypingEntity c WHERE c.call_id = :id")
	 CallTypingEntity findByIdInteger(@Param("id") Integer id);
	
	 @Modifying
	 @Transactional
	 @Query("DELETE FROM CallTypingEntity t WHERE t.call_id = :id")
	 void deleteByCustomId(@Param("id") Integer id);

}
