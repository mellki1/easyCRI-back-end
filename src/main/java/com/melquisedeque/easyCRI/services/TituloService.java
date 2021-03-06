package com.melquisedeque.easyCRI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melquisedeque.easyCRI.dao.TituloDAO;
import com.melquisedeque.easyCRI.entity.Titulo;


@Service
public class TituloService {

	@Autowired
	private TituloDAO repo;
	
	public List<Titulo> findAll() {
		List<Titulo> obj = repo.findAll();
		
		return obj;
	}
	
	public Titulo find(Integer id) {
		
		Optional<Titulo> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
	
	public Titulo registerTitulo(String nome) {
		
		Titulo obj = new Titulo();
		
		obj.setNome(nome);
		
		return repo.save(obj);
	}
}
