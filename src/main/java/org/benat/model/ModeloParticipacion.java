package org.benat.model;

import java.util.Objects;

public class ModeloParticipacion {

	private ModeloDeportista deportista;
	private ModeloEvento evento;
	private ModeloEquipo equipo;
	private int edad;
	private String medalla;

	public ModeloParticipacion() {}

	public ModeloParticipacion(ModeloDeportista deportista, ModeloEvento evento, ModeloEquipo equipo, int edad,
			String medalla) {
		super();
		this.deportista = deportista;
		this.evento = evento;
		this.equipo = equipo;
		this.edad = edad;
		this.medalla = medalla;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deportista, edad, equipo, evento, medalla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModeloParticipacion other = (ModeloParticipacion) obj;
		return Objects.equals(deportista, other.deportista) && edad == other.edad
				&& Objects.equals(equipo, other.equipo) && Objects.equals(evento, other.evento)
				&& Objects.equals(medalla, other.medalla);
	}

	public ModeloDeportista getDeportista() {
		return deportista;
	}

	public void setDeportista(ModeloDeportista deportista) {
		this.deportista = deportista;
	}

	public ModeloEvento getEvento() {
		return evento;
	}

	public void setEvento(ModeloEvento evento) {
		this.evento = evento;
	}

	public ModeloEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(ModeloEquipo equipo) {
		this.equipo = equipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMedalla() {
		return medalla;
	}

	public void setMedalla(String medalla) {
		this.medalla = medalla;
	}
	
}
