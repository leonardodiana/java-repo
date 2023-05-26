package com.diana.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diana.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {
	
	
	
}
