package com.diana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diana.entities.Prenotazione;
import com.diana.entities.Viaggio;
import com.diana.repo.PrenotazioneDAO;
import com.diana.repo.ViaggioDAO;
@Service
public class FlixbusServiceImpl implements FlixbusService {
	@Autowired//crea un oggetto automaticamente ogni volta che il programma lo richiede
	private ViaggioDAO viaggioDAO;
	@Autowired
	private PrenotazioneDAO prenotazioneDAO;
	
	@Override
	public Viaggio addViaggio(Viaggio v) {
		
		
		return viaggioDAO.save(v);// viaggioDAO salva il viaggio v nel db
	}

	@Override
	public List<Viaggio> getViaggi() {
	
		return viaggioDAO.findAll();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		
		return prenotazioneDAO.save(p);
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		
		return prenotazioneDAO.findAll();
	}

}
