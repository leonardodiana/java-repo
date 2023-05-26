package com.diana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diana.entities.Glossario;
import com.diana.repos.GlossarioDao;

@Service
public class GlossarioService {

	@Autowired
	private GlossarioDao dao;
	
	public List<String> getVoci(){
		return dao.findAll().stream().map(g -> g.getVoce()).toList();
	}
	
	public Glossario getByVoce(String voce) {
		
		return dao.findAll().stream().filter(g -> g.getVoce().equals(voce)).toList().get(0);
	}
	
}
