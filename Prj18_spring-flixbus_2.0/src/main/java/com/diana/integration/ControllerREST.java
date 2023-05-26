package com.diana.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diana.entities.Prenotazione;
import com.diana.entities.Viaggio;
import com.diana.services.FlixbusService;

@RestController//diventa un controller rest, quindi parlerà in json, sarà la nostra api
@RequestMapping("api")
public class ControllerREST {
	
	@Autowired
	private FlixbusService service;
	
	@GetMapping("viaggi")
		List<Viaggio> getViaggi(){
		return service.getViaggi();
	}
	
	@GetMapping("prenotazioni")
	List<Prenotazione> getPrenotazioni(){		
		return service.getPrenotazioni();
	}
	
	@PostMapping("viaggi")
	Viaggio addViaggio(@RequestBody Viaggio v) {
		return service.addViaggio(v);
	}
	

	@PostMapping("prenotazioni")
	Prenotazione addPrenotazione(@RequestBody Prenotazione p) {
		return service.addPrenotazione(p);
	}
	
	@PostMapping("lista/viaggi")
	List<Viaggio> addViaggio(@RequestBody List<Viaggio> viaggi) {
		for(Viaggio v : viaggi) {
			service.addViaggio(v);
		}
		return service.getViaggi();
	}

}
