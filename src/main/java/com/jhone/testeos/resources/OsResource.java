package com.jhone.testeos.resources;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhone.testeos.domain.Exame;
import com.jhone.testeos.domain.Medico;
import com.jhone.testeos.domain.OS;
import com.jhone.testeos.domain.OsExame;
import com.jhone.testeos.domain.Paciente;
import com.jhone.testeos.domain.PostoColeta;
import com.jhone.testeos.dtos.OSDTO;
import com.jhone.testeos.dtos.OsExameDTO;
import com.jhone.testeos.services.OsService;



@RestController
@RequestMapping(value = "/testeos")
public class OsResource {
	
	@Autowired
	private OsService service;
	
	@CrossOrigin("*")
	@GetMapping
	public ResponseEntity<List<OSDTO>> findAll(){
		
		List<OSDTO> list = service.findAll().stream().map(obj -> new OSDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/exames")
	public List<Exame> ExamefindAll(){
		return service.examefindAll();
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/medicos")
	public List<Medico> medicofindAll(){
		return service.medicofindAll();
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/pacientes")
	public List<Paciente> pacinetefindAll(){
		return service.pacientefindAll();
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/postocoletas")
	public List<PostoColeta> postocoletafindAll(){
		return service.postocoletafindAll();
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/os/exames/{os_id}")
	public List<OsExame> getAllExamesByOsId(@PathVariable (value = "os_id") Integer os_id){
		return service.getAllExamesByOsId(os_id);
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/exame/{id}")
	public Exame getExameById(@PathVariable (value = "id") Integer id){
		return service.getExameById(id);
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/oslast")
	public OS FindOsLastId(){
		return service.FindOsLastId();
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/medico/{id}")
	public Medico getMedicoById(@PathVariable (value = "id") Integer id){
		return service.findMedicoById(id);
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/paciente/{id}")
	public Paciente getPacienteById(@PathVariable (value = "id") Integer id){
		return service.findPacienteById(id);
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/postocoleta/{id}")
	public PostoColeta getPostoColetaById(@PathVariable (value = "id") Integer id){
		return service.findPostoColetaById(id);
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/{id}")
	public ResponseEntity<OSDTO> findById(@PathVariable Integer id) {
		OSDTO obj = new OSDTO(service.getOsById(id));
		return ResponseEntity.ok().body(obj);
	}
	
	@CrossOrigin("*")
	@PostMapping
	public OSDTO create(@RequestBody OSDTO obj) {
		System.out.println("no resource"+obj.getMedico());
		obj = new OSDTO(service.createos(obj));
		
		return obj;
	}
	
	
	@CrossOrigin("*")
	@PostMapping(value = "/osexame")
	public OsExameDTO createosexame(@RequestBody OsExameDTO obj) {
		System.out.println("resource exame.:"+obj.getExame());
		obj = new OsExameDTO(service.createosexame(obj));
		return obj;
	}
	
	@CrossOrigin("*")
	@PostMapping(value = "/osexame/upd")
	public OsExameDTO updosexame(@RequestBody OsExameDTO obj) {
		System.out.println("resource updosexame.:"+obj.getExame());
		
		obj = new OsExameDTO(service.updosexame(obj));
		return obj;
	}
	
	@CrossOrigin("*")
	@PostMapping(value = "/osexame/dlt")
	public void dltosexame(@RequestBody OsExameDTO obj) {
		System.out.println("resource dltosexame.:"+obj.getExame());
		
		service.dltosexame(obj);
		
	}
	
	@CrossOrigin("*")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
