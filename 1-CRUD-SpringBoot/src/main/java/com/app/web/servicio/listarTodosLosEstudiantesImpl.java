package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class listarTodosLosEstudiantesImpl implements EstudianteServicio{

	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiantes(Estudiante estudiantes) {
		return repositorio.save(estudiantes);
	}
 
}
