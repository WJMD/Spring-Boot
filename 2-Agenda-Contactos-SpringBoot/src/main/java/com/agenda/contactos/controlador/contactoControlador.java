package com.agenda.contactos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.agenda.contactos.modelo.contacto;

@Controller
public class contactoControlador {

	@GetMapping({"/",""})
	public String verPaginaDeInicio() {
		return "index.html";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioDeRegistroContacto(Model modelo) {
		modelo.addAttribute("contacto", new contacto());
		return "nuevo";
	}
}
