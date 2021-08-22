package com.edutecno.dto;

public class InscripcionDTO {
	
	private int idInscripcion;
	private String nombre;
	private String telefono;
	private int idCurso;
	private int idFormaDePago;

	public int getIdInscripcion() {
		return idInscripcion;
	}

	public void setIdInscripcion(int idInscripcion) {
		this.idInscripcion = idInscripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdFormaDePago() {
		return idFormaDePago;
	}

	public void setIdFormaDePago(int idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}

	@Override
	public String toString() {
		return "InscripcionDTO [idInscripcion=" + idInscripcion + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", idCurso=" + idCurso + ", idFormaDePago=" + idFormaDePago + "]";
	}
	
}
