package com.idat.EFMarileslyNavarroMicroservicioPizzaPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFMarileslyNavarroMicroservicioPizzaPrueba.model.Pizza;
import com.idat.EFMarileslyNavarroMicroservicioPizzaPrueba.repository.PizzaRepository;

@Service
public class PizzaServiceImp implements PizzaService {

	@Autowired
	private PizzaRepository repository;
	
	@Override
	public List<Pizza> listar() {
		return repository.findAll();
	}

	@Override
	public Pizza obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizza pizza) {
		repository.save(pizza);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Pizza pizza) {
		repository.saveAndFlush(pizza);
	}

}
