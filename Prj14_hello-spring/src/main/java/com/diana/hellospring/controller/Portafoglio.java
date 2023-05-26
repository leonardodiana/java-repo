package com.diana.hellospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.diana.hellospring.model.Titolo;
@Component 
public class Portafoglio {

	
	private List<Titolo> titoli = new ArrayList<>();
	
	
	public List<Titolo> getTitoli() {
		return titoli;
	}

	public void setTitoli(List<Titolo> titoli) {
		this.titoli = titoli;
	}

	public void addTitolo(Titolo string) {
		titoli.add(string);
	}
	
	public void addTitolo(String nome, double prezzo) {
		Titolo t= new Titolo();
		t.setNome(nome);
		t.setValore(prezzo);
		titoli.add(t);
	}

	
		
	
}
