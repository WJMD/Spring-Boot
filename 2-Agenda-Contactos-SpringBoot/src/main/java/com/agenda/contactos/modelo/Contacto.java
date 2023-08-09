package com.agenda.contactos.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity
@Table(name = "Contactos")
public class Contacto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	//@Column(name = "nombre", nullable = false, length = 50)
	@NotBlank(message = "Debe ingresar su nombre")
	private String nombre;

	//@Column(name = "celular", nullable = false, length = 50)
	@NotBlank(message = "Debe ingresar su celular")
	private String celular;

	//@Column(name = "email", nullable = false, length = 50, unique = true)
	@NotEmpty(message = "Debe ingresar su email")
	private String email;

	//@Column(name = "fechaNacimiento", nullable = false, length = 50)
	@DateTimeFormat(iso = ISO.DATE)
	@Past
	@NotNull
	private LocalDate fechaNacimiento;

	//@Column(name = "fechaRegistro", nullable = false, length = 50)
	private LocalDateTime fechaRegistro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	@PrePersist
	public void asignarFechaRegistro() {
		fechaRegistro = LocalDateTime.now();
	}

	public Contacto() {
		super();
	}

	public Contacto(Integer id, String nombre, String celular, String email, LocalDate fechaNacimiento,
			LocalDateTime fechaRegistro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
	}

	public Contacto(String nombre, String celular, String email, LocalDate fechaNacimiento,
			LocalDateTime fechaRegistro) {
		super();
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
	}

}
