package com.onnis.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onnis.entities.Prenotazione;
import com.onnis.entities.Viaggio;
import com.onnis.services.ViaggiService;

@Controller
@RequestMapping("")
public class ControllerMVC {

	@Autowired
	private ViaggiService service;
	
	@GetMapping(value = {"viaggi", "tratte"})
	String getViaggi(Model m){
		m.addAttribute("titolo","pagina elenco viaggi");
		m.addAttribute("viaggi", service.getViaggi());
		return "elencoViaggi"; 
	}
	
	@GetMapping(value = {"prenotazioni", "conferme"})
	String getPrenotazione(Model m){
		m.addAttribute("titolo","pagina elenco prenotazioni");
		return "elencoPrenotazioni"; 
	}
	
	@GetMapping("login")
	String login(Model m){
		m.addAttribute("titolo","login");
		return "login"; 
	}
	
	@GetMapping("dettaglio/{id}")
	String dettaglio(Model m, @PathVariable int id){
		m.addAttribute("titolo","dettaglio");
		m.addAttribute("viaggio", service.getViaggioById(id));
		return "dettaglio"; 
	}
	
	@GetMapping("prenota")
	String prenota(Model m){
		m.addAttribute("titolo","prenota");
		return "prenota"; 
	}
	
	@GetMapping("conferma")
	String conferma(Model m){
		m.addAttribute("titolo","conferma");
		return "conferma"; 
	}
	
	@PostMapping("login")
	String doLogin(@RequestParam String username, @RequestParam String password) {
		if(username.equals("luca") && password.equals("12345")) {
			return "redirect:viaggi";
		}
		return"redirect:login";
	}
	
}
