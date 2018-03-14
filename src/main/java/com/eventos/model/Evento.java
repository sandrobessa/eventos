package com.eventos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class Evento {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private String codigo;
	//@NotBlank
	private String name;
	
	@NotBlank
	private String local;
	
	@NotBlank
	private String data;
	
	@NotBlank
	private String horario;
	
	//public String getCodigo() {
	//	return codigo;
	//}
	//public void setCodigo(String codigo) {
	//	this.codigo = codigo;
	//}
	public String getName() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
