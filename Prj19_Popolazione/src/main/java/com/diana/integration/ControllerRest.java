package com.diana.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diana.entities.Provincia;
import com.diana.service.ProvinciaService;

@RestController
@RequestMapping("api")
public class ControllerRest {
	
	@Autowired
	private ProvinciaService service;
	
	@GetMapping("province")
	List<Provincia> getProvince(){
		return service.getProvince();
	}
	@GetMapping("province/id")
	Provincia getProvincia(@PathVariable int id) {
		return service.getProvinciaById(id);
		
	}
	
}
