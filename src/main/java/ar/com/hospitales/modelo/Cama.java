package ar.com.hospitales.modelo;

import ar.com.hospitales.modelo.EstadoCama;

public class Cama {
	
	private int numero;
	private EstadoCama estado;
	
	
	public Cama() {
		this.estado = EstadoCama.LIBRE;
	}

	public Cama(EstadoCama estado, int numero) {
		this.estado = estado;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public EstadoCama getEstado() {
		return estado;
	}

	public void setEstado(EstadoCama estado) {
		this.estado = estado;
	}

	public void mostrar() {
		System.out.println("Estado: " + estado);
		System.out.println("Numero: " + numero);
	}

}