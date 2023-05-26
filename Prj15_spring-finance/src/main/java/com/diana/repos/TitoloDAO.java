package com.diana.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diana.entities.Titolo;

@Repository
public interface TitoloDAO  extends JpaRepository<Titolo, Integer>{

}
