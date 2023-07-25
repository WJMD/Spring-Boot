package com.registro.usuarios.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Rol;
import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	private UsuarioRepositorio usuarioRepositorio;
	
	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}
	
	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(),
				registroDTO.getApellido(),registroDTO.getEmail(),
				registroDTO.getPassword(),Arrays.asList(new Rol("ROL_USer")));
			
			return usuarioRepositorio.save(usuario);
	}

}
