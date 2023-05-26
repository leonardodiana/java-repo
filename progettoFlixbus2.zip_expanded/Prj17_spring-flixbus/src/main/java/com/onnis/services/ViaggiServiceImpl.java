package com.onnis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onnis.entities.Prenotazione;
import com.onnis.entities.Viaggio;
import com.onnis.repos.PrenotazioneDAO;
import com.onnis.repos.ViaggioDAO;

@Service
public class ViaggiServiceImpl implements ViaggiService {
	
	@Autowired
	private ViaggioDAO viaggiodao;
	@Autowired
	private PrenotazioneDAO prenotazionedao;
	
	@Override
	public List<Viaggio> getViaggi() {
		return viaggiodao.findAll();
	}

	@Override
	public Viaggio getViaggioById(int id) {
		return viaggiodao.getReferenceById(id);
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		return viaggiodao.save(v);
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		return prenotazionedao.findAll();
	}

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		return prenotazionedao.getReferenceById(id);
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return prenotazionedao.save(p);
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		return prenotazionedao.save(p);
	}

	@Override
	public void deletePrenotazione(Prenotazione p) {
		prenotazionedao.delete(p);
	}

}
