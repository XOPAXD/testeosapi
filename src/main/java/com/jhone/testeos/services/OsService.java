package com.jhone.testeos.services;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhone.testeos.domain.Exame;
import com.jhone.testeos.domain.Medico;
import com.jhone.testeos.domain.OS;
import com.jhone.testeos.domain.OsExame;
import com.jhone.testeos.domain.Paciente;
import com.jhone.testeos.domain.PostoColeta;
import com.jhone.testeos.dtos.OSDTO;
import com.jhone.testeos.dtos.OsExameDTO;
import com.jhone.testeos.exceptions.ObjectNotFoundException;
import com.jhone.testeos.repositories.ExameRepository;
import com.jhone.testeos.repositories.MedicoRepository;
import com.jhone.testeos.repositories.OsExameRepository;
import com.jhone.testeos.repositories.OsRepository;
import com.jhone.testeos.repositories.PacienteRepository;
import com.jhone.testeos.repositories.PostoColetaRepository;





@Service
public class OsService {
	
	@Autowired
	private OsRepository osrepository;
	
	@Autowired
	private OsExameRepository osexamerepository;
	
	@Autowired
	private ExameRepository examerepository;
	
	@Autowired
	private MedicoRepository medicorepository;
	
	@Autowired
	private PacienteRepository pacienterepository;
	
	@Autowired
	private PostoColetaRepository postocoletarepository;
	
	public List<OS> findAll(){
		return osrepository.findAll();
	}
	
	public List<Exame> examefindAll(){
		return examerepository.findAll();
	}
	
	public List<Medico> medicofindAll(){
		return medicorepository.findAll();
	}
	
	public List<Paciente> pacientefindAll(){
		return pacienterepository.findAll();
	}
	
	public List<PostoColeta> postocoletafindAll(){
		return postocoletarepository.findAll();
	}
	
	public OS createos(OSDTO obj) {
		return fromDTO(obj);
	}
	
	public OsExame createosexame(OsExameDTO obj) {
		return fromOsExameDto(obj);
	}
	
	public void delete(Integer id) {
		 osrepository.deleteById(id);
	}
	
	private OsExame fromOsExameDto(OsExameDTO obj) {
		OsExame newObj = new OsExame();
		newObj.setId(obj.getId());
		
		Exame  ex = getExameById(obj.getExame());
		OS     os = getOsById (obj.getOs());
		
		newObj.setExame(ex);
		newObj.setOs(os);
		
		return osexamerepository.save(newObj);
	}
	
	private OS fromDTO(OSDTO obj) {
		OS newObj = new OS();
		newObj.setId(obj.getId());
		newObj.setData(LocalDateTime.now());
		newObj.setConvenio(obj.getConvenio());
		

		Medico      med = findMedicoById(obj.getMedico());
		Paciente    pac = findPacienteById(obj.getPaciente());
		PostoColeta pos = findPostoColetaById(obj.getPostocoleta());
		
		
		newObj.setMedico_id(med);
		newObj.setPaciente_id(pac);
		newObj.setPostocoleta_id(pos);

		return osrepository.save(newObj);
	}
	
    public List<OsExame> getAllExamesByOsId(Integer os_id) {
    	
        return osexamerepository.findByOsId(os_id);
    }
    
    public Exame getExameById(Integer id) {
    	
    	Optional<Exame> obj = examerepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Exame.class.getName()));
    }
    
    
    public OS getOsById(Integer id) {
    	
    	Optional<OS> obj = osrepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Exame.class.getName()));
    }

    public Medico findMedicoById(Integer id) {
		
		Optional<Medico> obj = medicorepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Medico.class.getName()));
	}
	
	public Paciente findPacienteById(Integer id) {
		
		Optional<Paciente> obj = pacienterepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Paciente.class.getName()));
	}
	
	public PostoColeta findPostoColetaById(Integer id) {
		
		Optional<PostoColeta> obj = postocoletarepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + PostoColeta.class.getName()));
	}
}
