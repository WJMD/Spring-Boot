package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.repositorio.EstudianteRepositorio;

@Controller
public class EstudianteControlador {

	@Autowired
	private EstudianteRepositorio repositorio;
	
	@GetMapping({"/estudiantes","/"})
	public String  listarEstudiantes() {
		return "estudiantes";//Nos retorna al achivo estudiantes
	}
	
}
