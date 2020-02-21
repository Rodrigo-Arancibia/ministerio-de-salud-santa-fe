package ar.com.hospitales.modelo;

import java.util.ArrayList;
import java.util.List;

public class AltaComplejidad extends Hospital {
	
	private int capacidad;
	private String especialidad;
	private Integer cant_camas;
	private List<Cama> camas;

	public AltaComplejidad() {
		this.camas = new ArrayList<>();
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public Integer getCant_camas() {
		return cant_camas;
	}

	public void setCant_camas(Integer cant_camas) {
		this.cant_camas = cant_camas;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public List<Cama> getCamas() {
		return camas;
	}

	public void setCamas(List<Cama> camas) {
		this.camas = camas;
	}

	public void cambiarElEstadoDeUnaCama(EstadoCama estado, int numeroDeCama) {
		if (numeroDeCama > -1) {
			for (Cama cama : this.camas) {
				if (cama.getNumero() == numeroDeCama) {
					cama.setEstado(estado);
					break;
				}
			}
		}
	}

	public void agregarCama(EstadoCama estadoCama, int numero) {
		this.camas.add(new Cama(estadoCama, numero));
	}

	public int cuantasCamasExisten() {
		return this.camas.size();
	}

	public int cuantasEstanOcupadas() {
		int conteo = 0;
		for (Cama cama : this.camas) {
			if (cama.getEstado().equals(EstadoCama.OCUPADA)) {
				conteo++;
			}
		}
		return conteo;
	}

	@Override
	public void mostrar() {
		System.out.println("HOSPITAL ALTA COMPLEJIDAD: " + "\n");

		System.out.println("Nombre: " + nombre);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("Director: " + director);

		System.out.println("Capacidad: " + capacidad);
		System.out.println("Especialidad: " + especialidad + "\n" + "\n");

		for (Cama cama : this.camas) {
			cama.mostrar();
		}
	}
}