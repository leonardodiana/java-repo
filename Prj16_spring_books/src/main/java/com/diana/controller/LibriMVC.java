package com.diana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diana.entities.Libro;
import com.diana.services.LibroServices;

@Controller
@RequestMapping("")
public class LibriMVC {

	@Autowired
	private LibroServices service;
	
	@GetMapping("libri")
	public String getlibri(Model m){
		m.addAttribute("elecoLibri", service.getLibri());
		
		return "libreria";
	}
	@PostMapping("libri")
	public String addLibro(Libro l) {
		service.addLibro(l);
		return "redirect: libri";
	}
}
