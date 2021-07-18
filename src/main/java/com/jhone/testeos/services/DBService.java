package com.jhone.testeos.services;


import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhone.testeos.domain.Exame;
import com.jhone.testeos.domain.Medico;
import com.jhone.testeos.domain.OS;
import com.jhone.testeos.domain.OsExame;
import com.jhone.testeos.domain.Paciente;
import com.jhone.testeos.domain.PostoColeta;
import com.jhone.testeos.domain.enuns.Sexo;
import com.jhone.testeos.repositories.ExameRepository;
import com.jhone.testeos.repositories.MedicoRepository;
import com.jhone.testeos.repositories.OsExameRepository;
import com.jhone.testeos.repositories.OsRepository;
import com.jhone.testeos.repositories.PacienteRepository;
import com.jhone.testeos.repositories.PostoColetaRepository;

@Service
public class DBService {
	
	@Autowired
	private PostoColetaRepository postocoletarepository;
	@Autowired
	private MedicoRepository medicorepository;
	@Autowired
	private PacienteRepository pacienterepository;
	@Autowired
	private ExameRepository examerepository;
	@Autowired
	private OsRepository osrepository;
	@Autowired
	private OsExameRepository osexamerepository;
	
	
	public void instanciaDB() {
		PostoColeta p1 = new PostoColeta(null, "Posto de Coleta 1", "Av ficticia 1"); 
		PostoColeta p2 = new PostoColeta(null, "Posto de Coleta 2", "Av ficticia 2");
		
		Medico m1 = new Medico(null, "Medico teste 1", "Especialidade 1");
		Medico m2 = new Medico(null, "Medico teste 2", "Especialidade 2");
		
		Paciente pa1 = new Paciente(null,"Paciente 1",LocalDateTime.now(),Sexo.MASCULINO,"Av pacienete 1");
		Paciente pa2 = new Paciente(null,"Paciente 1",LocalDateTime.now(),Sexo.FEMININO,"Av pacienete 1");
		
		
		
		OS os1 = new OS(null, LocalDateTime.now(), pa1, "CONVENIO 1", p1, m1);
		OS os2 = new OS(null, LocalDateTime.now(), pa2, "CONVENIO 2", p2, m2);
		
		
		Exame e1 = new Exame(null, "Hemograma", 100.00);
		Exame e2 = new Exame(null, "Colesterol", 150.00);
		Exame e3 = new Exame(null, "Exame 3", 155.00);
		Exame e4 = new Exame(null, "Exame 4", 199.00);
		
		OsExame ose1 = new OsExame(null, os1, e1); 
		OsExame ose2 = new OsExame(null, os1, e2);
		OsExame ose3 = new OsExame(null, os1, e3);
		OsExame ose4 = new OsExame(null, os2, e3);
		OsExame ose5 = new OsExame(null, os2, e4);
		
		postocoletarepository.saveAll(Arrays.asList(p1,p2));
		medicorepository.saveAll(Arrays.asList(m1,m2));
		pacienterepository.saveAll(Arrays.asList(pa1,pa2));
		examerepository.saveAll(Arrays.asList(e1,e2,e3,e4));
		osrepository.saveAll(Arrays.asList(os1,os2));
		osexamerepository.saveAll(Arrays.asList(ose1,ose2,ose3,ose4,ose5));
		
		
		
	}
}
