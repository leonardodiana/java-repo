package com.onnis.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onnis.entities.Prenotazione;
import com.onnis.entities.Viaggio;
import com.onnis.services.ViaggiService;

@RestController
@RequestMapping("api")
public class ControllerRest {

	@Autowired
	private ViaggiService service;
	
	@GetMapping(value = {"viaggi", "tratte"})
	List<Viaggio> getViaggi(){
		return service.getViaggi(); 
	}
	
	@GetMapping(value = {"prenotazioni", "conferme"})
	List<Prenotazione> getPrenotazione(){
		return service.getPrenotazioni(); 
	}
}
