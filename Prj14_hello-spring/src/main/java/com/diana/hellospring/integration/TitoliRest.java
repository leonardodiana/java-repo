package com.diana.hellospring.integration;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diana.hellospring.controller.Portafoglio;
import com.diana.hellospring.model.Titolo;

@RestController
@RequestMapping("api")
public class TitoliRest {
	
	private Portafoglio service= new Portafoglio();

	@GetMapping("titoli")
	public List<Titolo> getTitoli(){
		service.addTitolo("FIAT", 50);
		service.addTitolo("San Paolo", 100);
		service.addTitolo("Ferrari", 150);
		service.addTitolo("Maserati", 200);
		service.addTitolo("Lamborghini", 250);
		
		return service.getTitoli();
	}
	@PostMapping("titoli")
	public Titolo addTitolo(@RequestBody Titolo t) {
		service.addTitolo(t);
		return t;
	}
}
