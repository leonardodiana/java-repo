package com.diana.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diana.entities.Titolo;
import com.diana.services.TitoloService;

@RestController
@RequestMapping("api")
public class TitoliREST {
	
	@Autowired
	private TitoloService service;
	
	@GetMapping("titoli")
	
	public List<Titolo> getTitoli(){
		return service.getTitoli();
	}
	
}
