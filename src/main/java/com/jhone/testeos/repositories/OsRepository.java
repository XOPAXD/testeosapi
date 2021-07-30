package com.jhone.testeos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jhone.testeos.domain.OS;
import com.jhone.testeos.domain.OsExame;

public interface OsRepository extends JpaRepository<OS, Integer>{
	OS findTopByOrderByIdDesc();
	
	//@Query("SELECT obj FROM Os obj WHERE obj.id >0 ORDER")
	//List<OsExame> findLastOs(@Param("os_id") Integer os_id);
}
