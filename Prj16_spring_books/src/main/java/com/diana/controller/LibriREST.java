package com.diana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diana.entities.Libro;
import com.diana.services.LibroServices;

@RestController
@RequestMapping("api")
public class LibriREST {

	@Autowired
	private LibroServices service;
	
	@GetMapping("libri")
	public List<Libro> getLibri(){
		return service.getLibri();
	}
	
}
