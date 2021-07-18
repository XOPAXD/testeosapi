package com.jhone.testeos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhone.testeos.domain.Medico;

public  interface MedicoRepository extends JpaRepository<Medico, Integer>{

	Medico findById(Medico medico_id);

}
