package com.jhone.testeos.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jhone.testeos.domain.enuns.Sexo;


@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataNasc; 
	
	private Integer sexo;
	private String endereco;
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(Integer id, String nome, LocalDateTime dataNasc, Sexo sexo, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = (sexo == null) ? 0 : sexo.getCod();
		this.endereco = endereco;
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

	
	public Sexo getSsexo() {
		return Sexo.toEnum(this.sexo);
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo.getCod();
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
