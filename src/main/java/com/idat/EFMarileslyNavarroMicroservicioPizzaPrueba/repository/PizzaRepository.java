package com.idat.EFMarileslyNavarroMicroservicioPizzaPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFMarileslyNavarroMicroservicioPizzaPrueba.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
