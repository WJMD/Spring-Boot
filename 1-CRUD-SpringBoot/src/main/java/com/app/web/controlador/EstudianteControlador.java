package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Estudiante;
import com.app.web.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {

	@Autowired
	private EstudianteServicio servicio;
	
	@GetMapping({"/estudiantes","/"})
	public String  listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes";//Nos retorna al archivo estudiantes
	}
	
	@GetMapping({"/estudiantes/nuevo"})
	public String MostrarFormilarioDeRegistrarEstudiante(Model modelo) {
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante", estudiante);
		return "crear_estudiante";
	}
	
	@PostMapping("/estudiantes")
	public String GuardarEstudiantes(@ModelAttribute("estudiante") Estudiante estudiante) {
		servicio.guardarEstudiantes(estudiante);
		return "redirect:/estudiantes";
	}
	
}
