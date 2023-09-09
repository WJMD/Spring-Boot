package com.sistema.trailers.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class FileNotFounsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FileNotFounsException(String mensaje) {
		super(mensaje);
	}

	public FileNotFounsException(String mensaje, Throwable excepcion) {
		super(mensaje, excepcion);
	}

}
