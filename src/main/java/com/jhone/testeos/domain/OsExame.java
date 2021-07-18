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
	
	@ManyToOne
	@JoinColumn(name = "os_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OS os;
	
	
	@OneToOne
	@JoinColumn(name = "exame_id")
	private Exame exame;
	
	public OsExame() {
		super();
	}

	public OsExame(Integer id, OS os, Exame exame) {
		super();
		this.id = id;
		this.os = os;
		this.exame = exame;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		this.os = os;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}
	
	
}
