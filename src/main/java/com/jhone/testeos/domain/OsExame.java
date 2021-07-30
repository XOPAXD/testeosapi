package com.jhone.testeos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class OsExame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@ManyToOne
	//@JoinColumn(name = "os_id")
	//@OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Integer os_id;
	
	
	//qq@OneToOne
	//@JoinColumn(name = "exame_id")
	private Integer exame_id;
	
	public OsExame() {
		super();
	}

	public OsExame(Integer id, Integer os, Integer exame) {
		super();
		this.id = id;
		this.os_id = os;
		this.exame_id = exame;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOs() {
		return os_id;
	}

	public void setOs(Integer os_id) {
		this.os_id = os_id;
	}

	public Integer getExame() {
		return exame_id;
	}

	public void setExame(Integer exame_id) {
		this.exame_id = exame_id;
	}
	
	
}
