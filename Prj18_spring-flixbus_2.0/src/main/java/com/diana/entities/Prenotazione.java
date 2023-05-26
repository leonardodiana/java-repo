package com.diana.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {

	
	@Id  //con questa annotazione definisco id come chiave primaria.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //quando sarà creato un nuovo viaggio la chiave primaria sarà gestita dal db con autoincrement
	private int id;
	
	private LocalDate data;
	private String utente;
	private int numViaggiatori;
	@OneToOne// serve per definire viaggio come chiave esterna
	private Viaggio viaggio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getUtente() {
		return utente;
	}
	public void setUtente(String utente) {
		this.utente = utente;
	}
	public int getNumViaggiatori() {
		return numViaggiatori;
	}
	public void setNumViaggiatori(int numViaggiatori) {
		this.numViaggiatori = numViaggiatori;
	}
	public Viaggio getViaggio() {
		return viaggio;
	}
	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}
	
	
	
}
