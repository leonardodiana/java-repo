package com.diana.services;

import java.util.List;

import com.diana.entities.Prenotazione;
import com.diana.entities.Viaggio;

public interface FlixbusService {

	Viaggio addViaggio(Viaggio v);
	List<Viaggio> getViaggi();
	
	Prenotazione addPrenotazione(Prenotazione p);
	List<Prenotazione> getPrenotazioni();
	
}
