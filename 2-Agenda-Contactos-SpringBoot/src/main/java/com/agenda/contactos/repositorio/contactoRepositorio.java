package com.agenda.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenda.contactos.modelo.contacto;

@Repository
public interface contactoRepositorio extends JpaRepository<contacto, Integer>{
 
	
	
}
