package com.onnis;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onnis.entities.Prenotazione;
import com.onnis.entities.Viaggio;
import com.onnis.services.ViaggiService;

@SpringBootTest
class Prj17SpringFlixbusApplicationTests {
	@Autowired
	private ViaggiService service;
	@Test
	void contextLoads() {
		Viaggio v = new Viaggio();
		v.setPartenza("Torino");
		v.setDestinazione("Firenze");
		v.setDurata(3);
		service.addViaggio(v);
		
		Prenotazione p = new Prenotazione();
		p.setData(LocalDate.now());
		p.setImporto(10);
		p.setNomeUtente("Luca");
		p.setNumeroPosti(1);
		p.setViaggio(v);
		service.addPrenotazione(p);
	}

}
