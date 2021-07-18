package com.jhone.testeos.dtos;

import java.io.Serializable;

import com.jhone.testeos.domain.PostoColeta;

public class PostoColetaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descricao;
	private String endereco;
	
	public PostoColetaDTO() {
		super();
	}
	
	public PostoColetaDTO(PostoColeta obj) {
		super();
		this.id 	   = obj.getId();
		this.descricao = obj.getDescricao();
		this.endereco  = obj.getEndereco();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
