package com.sistema.trailers.servicio;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Resource;

public interface AlmacenServicio {

	public void iniciarAlmacenDeArchivo();

	public String almacenarArchivo(MultipartFile archivo);

	public Path cargarArchivo(String nombreArchivo);

	public Resource cargarComoRecurso(String nombreArchivo);

	public void eliminarArchivo(String nombreArchivo);

	
}