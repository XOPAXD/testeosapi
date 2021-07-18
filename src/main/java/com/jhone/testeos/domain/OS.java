package com.jhone.testeos.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime data;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "paciente_id")
	private Paciente paciente_id;
	
	private String convenio;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "postocoleta_id")
	private PostoColeta postocoleta_id;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "medico_id")
	private Medico medico_id;

	public OS() {
		super();
		this.setData(LocalDateTime.now());
		
	}

	public OS(Integer id, LocalDateTime data, Paciente paciente_id, String convenio, PostoColeta postocoleta_id,
			Medico medico_id) {
		super();
		this.id = id;
		this.data = data;
		this.paciente_id = paciente_id;
		this.convenio = convenio;
		this.postocoleta_id = postocoleta_id;
		this.medico_id = medico_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Paciente getPaciente_id() {
		return paciente_id;
	}

	public void setPaciente_id(Paciente paciente_id) {
		this.paciente_id = paciente_id;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public PostoColeta getPostocoleta_id() {
		return postocoleta_id;
	}

	public void setPostocoleta_id(PostoColeta postocoleta_id) {
		this.postocoleta_id = postocoleta_id;
	}


	public Medico getMedico_id() {
		return medico_id;
	}

	public void setMedico_id(Medico medico_id) {
		this.medico_id = medico_id;
	}
	
	
	
	
}
