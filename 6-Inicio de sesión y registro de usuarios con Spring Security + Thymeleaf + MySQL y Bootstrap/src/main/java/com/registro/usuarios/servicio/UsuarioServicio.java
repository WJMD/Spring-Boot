package com.registro.usuarios.servicio;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;

public interface UsuarioServicio {

	
	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
}
