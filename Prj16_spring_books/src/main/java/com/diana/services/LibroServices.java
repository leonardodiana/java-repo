package com.diana.services;

import java.util.List;

import com.diana.entities.Libro;

public interface LibroServices {

	
	List<Libro> getLibri();
	Libro getLibroById(int id);
	
	Libro addLibro(Libro l);
	Libro updateLibro(Libro l);
	boolean deleteLibro(int id);
	void addLibro(int i);
	
}
