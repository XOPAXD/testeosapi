package com.jhone.testeos.dtos;

import java.io.Serializable;

import com.jhone.testeos.domain.Medico;

public class MedicoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String especialidade;
	
	public MedicoDTO() {
		super();
	}
	
	public MedicoDTO(Medico obj) {
		super();
		this.id 		   = obj.getId();
		this.nome 		   = obj.getNome();
		this.especialidade = obj.getEspecialidade();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
