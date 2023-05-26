package com.diana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="testo")
public class Testo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTesto;
	private String contenuto;
	
	public int getIdTesto() {
		return idTesto;
	}
	public void setIdTesto(int idTesto) {
		this.idTesto = idTesto;
	}
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	

}
