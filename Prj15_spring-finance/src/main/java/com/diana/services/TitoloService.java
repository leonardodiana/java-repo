package com.diana.services;

import java.util.List;

import com.diana.entities.Titolo;

public interface TitoloService {
	
	List<Titolo> getTitoli();
	List<Titolo> getTitoliByRaccomandazioni0(String raccomandazioni);
	
	Titolo getTitoloByID(int id);
	
	Titolo addTitolo(Titolo t);
	
	

}
