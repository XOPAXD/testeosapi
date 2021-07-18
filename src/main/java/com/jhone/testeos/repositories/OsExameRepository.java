package com.jhone.testeos.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jhone.testeos.domain.OsExame;

public interface OsExameRepository extends JpaRepository<OsExame, Integer>{
	
	List<OsExame> findByOsId(Integer os_id);
    //Optional<OsExame> findByIdAndOsId(Integer exame_id, Integer os_id);
}
