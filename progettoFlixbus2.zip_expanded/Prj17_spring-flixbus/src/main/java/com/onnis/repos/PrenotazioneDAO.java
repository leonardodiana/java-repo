package com.onnis.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onnis.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
