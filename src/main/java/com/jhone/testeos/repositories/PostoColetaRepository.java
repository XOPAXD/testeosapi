package com.jhone.testeos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhone.testeos.domain.PostoColeta;

@Repository
public interface PostoColetaRepository extends JpaRepository<PostoColeta, Integer>{

}
