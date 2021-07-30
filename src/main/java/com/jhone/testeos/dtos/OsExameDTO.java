package com.jhone.testeos.dtos;

import java.io.Serializable;
import com.jhone.testeos.domain.OsExame;

public class OsExameDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer exame_id;
	private Integer os_id;
	
	
	public OsExameDTO() {
		super();
	}
	
	public OsExameDTO(OsExame obj) {
		super();
		
		this.id = obj.getId();
		this.exame_id = obj.getExame();
		this.os_id = obj.getOs();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExame() {
		return exame_id;
	}

	public void setExame(Integer exame_id) {
		this.exame_id = exame_id;
	}

	public Integer getOs() {
		return os_id;
	}

	public void setOs(Integer os_id) {
		this.os_id = os_id;
	}
	
	
}
