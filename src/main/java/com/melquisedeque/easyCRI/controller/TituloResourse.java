package com.melquisedeque.easyCRI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.melquisedeque.easyCRI.entity.Titulo;
import com.melquisedeque.easyCRI.services.TituloService;

@RestController
@RequestMapping(value="/titulos")
public class TituloResourse {

	@Autowired
	private TituloService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> finAll(){
		List<Titulo> obj = service.findAll();
		
		return ResponseEntity.ok().body(obj); 
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		
		Titulo obj = service.find(id);
		
		return ResponseEntity.ok().body(obj); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> find(String nome) {
	
		return ResponseEntity.ok().body(service.registerTitulo(nome));
	}
	

}
