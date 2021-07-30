package com.jhone.testeos.repositories;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jhone.testeos.domain.OsExame;

public interface OsExameRepository extends JpaRepository<OsExame, Integer>{

	@Query("SELECT obj FROM OsExame obj WHERE obj.os_id =:os_id")
	List<OsExame> findByOsId(@Param("os_id") Integer os_id);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM OsExame  WHERE os_id =:os_id")
	void deletebyosid(@Param("os_id") Integer os_id);
	
	
}
