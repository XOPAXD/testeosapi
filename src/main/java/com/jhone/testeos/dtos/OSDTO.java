package com.jhone.testeos.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.jhone.testeos.domain.OS;

public class OSDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime data;
	
	private String convenio;
	
	private Integer paciente;
	private Integer postocoleta;
	private Integer medico;
	
	public OSDTO() {
		super();
		
	}
	
	public OSDTO(OS obj) {
		this.id 		 = obj.getId();
		this.data 		 = obj.getData();
		this.convenio 	 = obj.getConvenio();
		this.medico 	 = obj.getMedico_id().getId();
		this.paciente 	 = obj.getPaciente_id().getId();
		this.postocoleta = obj.getPostocoleta_id().getId();
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

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public Integer getPaciente() {
		return paciente;
	}

	public void setPaciente(Integer paciente) {
		this.paciente = paciente;
	}

	public Integer getPostocoleta() {
		return postocoleta;
	}

	public void setPostocoleta(Integer postocoleta) {
		this.postocoleta = postocoleta;
	}

	public Integer getMedico() {
		return medico;
	}

	public void setMedico(Integer medico) {
		this.medico = medico;
	}
	
	
}
