package com.diana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;//aggiungendo @table e @entity importo queste due cose(Typically, an entity represents a table in a relational database)

@Entity
@Table(name = "viaggi")// inserisco nome della tabella del database, in questo caso viaggi, hanno sempre chiave primaria
public class Viaggio {
	
	@Id  //con questa annotazione definisco id come chiave primaria.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //quando sarà creato un nuovo viaggio la chiave primaria sarà gestita dal db con autoincrement
	private int id;
	
	private String partenza;
	private String destinazione;
	private double durata;
	
	/*
	 * non creo il costruttore perchè userò quello di default senza parametri.
	 * Facendo questa scelta però, avendo le proprietà private, è necessario generare getters e setters,
	 * in modo da settare successivamente le proprietà con le informazioni contenute nel db*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public double getDurata() {
		return durata;
	}
	public void setDurata(double durata) {
		this.durata = durata;
	}
	
	

}
