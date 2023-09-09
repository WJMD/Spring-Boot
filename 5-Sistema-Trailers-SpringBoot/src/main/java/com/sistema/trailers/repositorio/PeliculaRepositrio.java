package com.sistema.trailers.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.trailers.modelo.Pelicula;

public interface PeliculaRepositrio extends JpaRepository<Pelicula, Integer>{

}
