package com.example.demo;

import javax.persistence.*;

@Entity // Anotaciones de String
@Table(name = "usuarios") // Nombre de la tabla de la BD
public class Usuario {

	// Atribbutos identicos de la tabla
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el Id
	private Long idusuarios;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String tipoidentificacion;
	@Column
	private String numeroidentificacion;
	@Column
	private String rol;
	@Column
	private String email;
	@Column
	private String telefono;

	public String toString() {
		return "Usuario [idusuarios=" + this.idusuarios + ", nombre=" + this.nombre + ", apellido=" + this.apellido
				+ ", tipoidentificacion=" + this.tipoidentificacion + ", numeroidentificacion="
				+ this.numeroidentificacion + ",rol=" + this.rol + ",email=" + this.email + ",telefono=" + this.telefono
				+ "]";
	}


	public Long getIdusuarios() {
		return idusuarios;
	}


	public void setIdusuarios(Long idusuarios) {
		this.idusuarios = idusuarios;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(String tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public String getNumeroidentificacion() {
		return numeroidentificacion;
	}

	public void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
