package com.diana.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diana.entities.Provincia;
import com.diana.repos.ProvinciaDAO;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {
	
	@Autowired
	private ProvinciaDAO dao;

	@Override
	public List<String> getRegioni() {
		
		Set<String> regioni= new TreeSet();
		
		for(Provincia p : getProvince())
			regioni.add(p.getRegione());
		
		return new ArrayList<>(regioni);
	}

	@Override
	public List<Provincia> getProvince() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Provincia> getProvinceByRegione() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provincia getProvinciaById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

}
