package com.diana.service;

import java.util.List;

import com.diana.entities.Provincia;

public interface ProvinciaService {
	
	List<String> getRegioni();
	List<Provincia> getProvince();
	List<Provincia> getProvinceByRegione();
	Provincia getProvinciaById(int id);

}
