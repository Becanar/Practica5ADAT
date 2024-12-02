package org.benat.model;

import java.util.Objects;

public class ModeloEvento {

	private String nombre;
	private ModeloOlimpiada olimpiada;
	private ModeloDeporte deporte;

	public ModeloEvento() {}

	public ModeloEvento(String nombre, ModeloOlimpiada olimpiada, ModeloDeporte deporte) {
		this.nombre = nombre;
		this.olimpiada = olimpiada;
		this.deporte = deporte;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deporte, nombre, olimpiada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModeloEvento other = (ModeloEvento) obj;
		return Objects.equals(deporte, other.deporte) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(olimpiada, other.olimpiada);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ModeloOlimpiada getOlimpiada() {
		return olimpiada;
	}

	public void setOlimpiada(ModeloOlimpiada olimpiada) {
		this.olimpiada = olimpiada;
	}

	public ModeloDeporte getDeporte() {
		return deporte;
	}

	public void setDeporte(ModeloDeporte deporte) {
		this.deporte = deporte;
	}

}
