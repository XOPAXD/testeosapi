package com.jhone.testeos.dtos;

import java.io.Serializable;
import com.jhone.testeos.domain.OsExame;

public class OsExameDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer exame;
	private Integer os;
	
	
	public OsExameDTO() {
		super();
	}
	
	public OsExameDTO(OsExame obj) {
		super();
		
		this.id = obj.getId();
		this.exame = obj.getExame().getId();
		this.os = obj.getOs().getId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExame() {
		return exame;
	}

	public void setExame(Integer exame) {
		this.exame = exame;
	}

	public Integer getOs() {
		return os;
	}

	public void setOs(Integer os) {
		this.os = os;
	}
	
	
}
