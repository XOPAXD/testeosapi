package com.jhone.testeos.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.jhone.testeos.domain.Paciente;

public class PacienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private LocalDateTime dataNasc; 
	
	private Integer sexo;
	private String endereco;
	
	public PacienteDTO() {
		super();
		
	}
	
	public PacienteDTO(Paciente obj) {
		super();
		this.id 	  = obj.getId();
		this.nome 	  = obj.getNome();
		this.dataNasc = obj.getDataNasc();
		this.sexo     = obj.getSsexo().getCod();
		this.endereco = obj.getEndereco();
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

	public LocalDateTime getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDateTime dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
