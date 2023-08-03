package com.agenda.contactos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.contactos.modelo.Contacto;
import com.agenda.contactos.repositorio.ContactoRepositorio;

@Controller
public class ContactoControlador {

	@Autowired
	private ContactoRepositorio contactoRepositorio;
	
	@GetMapping({"/",""})
	public String verPaginaDeInicio() {
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioDeRegistroContacto(Model modelo) {
		modelo.addAttribute("contacto", new Contacto());
		return "nuevo";
	}
	
	@PostMapping("/nuevo")
	public String guardarContacto(Contacto contacto, RedirectAttributes redirect) {
		contactoRepositorio.save(contacto);
		redirect.addFlashAttribute("msgExito", "El contacto ha sido agregado con exito");
		return "redirect:/";
	}
	
}
