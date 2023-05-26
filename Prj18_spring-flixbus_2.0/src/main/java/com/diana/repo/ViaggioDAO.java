package com.diana.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diana.entities.Viaggio;

//interfaccia può estendere altre interfacce
public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
