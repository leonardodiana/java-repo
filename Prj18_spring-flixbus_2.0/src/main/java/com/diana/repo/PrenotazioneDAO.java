package com.diana.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diana.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
