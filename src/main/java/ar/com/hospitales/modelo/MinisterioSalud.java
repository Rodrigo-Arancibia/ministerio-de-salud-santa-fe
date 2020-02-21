package ar.com.hospitales.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MinisterioSalud {

	private String ministro;
	private String provincia;
	private String domicilio;

	private ArrayList<Hospital> hospitales;

	
	public MinisterioSalud() {
		this.hospitales = new ArrayList<>();

	}

	public String getMinistro() {
		return ministro;
	}

	public void setMinistro(String ministro) {
		this.ministro = ministro;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void agregarHospital(Hospital h) {
		this.hospitales.add(h);
	}
	
	
	// ******************************************************************************************
	// CREACION HOSPITAL ALTA COMPLEJIDAD:

	public void crearHospitalAltaComplejidad(String nombre, String domicilio, String director,
			int capacidad, String especialidad, int cantCamas) {

		Hospital altaComplejidad = new AltaComplejidad();

		altaComplejidad.setNombre(nombre);
		altaComplejidad.setDomicilio(domicilio);
		altaComplejidad.setDirector(director);

		((AltaComplejidad) altaComplejidad).setCapacidad(capacidad);
		((AltaComplejidad) altaComplejidad).setEspecialidad(especialidad);
		((AltaComplejidad) altaComplejidad).setCant_camas(cantCamas);

		this.agregarHospital(altaComplejidad);

	}

	// ******************************************************************************************
	// CREACION HOSPITAL ATENCION PRIMARIA:

	public void crearHospitalAtencionPrimaria(String nombre, String domicilio, String director,
			int capacidad, boolean tieneLaboratorio,
			boolean tieneRadiologia, boolean tieneVacunatorio) {

		Hospital atencionPrimaria = new AtencionPrimaria();

		atencionPrimaria.setNombre(nombre);
		atencionPrimaria.setDomicilio(domicilio);
		atencionPrimaria.setDirector(director);

		((AtencionPrimaria) atencionPrimaria).setCapacidad(capacidad);
		((AtencionPrimaria) atencionPrimaria).setTieneLaboratorio(tieneLaboratorio);
		((AtencionPrimaria) atencionPrimaria).setTieneRadiologia(tieneRadiologia);
		((AtencionPrimaria) atencionPrimaria).setTieneVacunatorio(tieneVacunatorio);

		this.agregarHospital(atencionPrimaria);
	}


	public void mostrar() {
		System.out.println("MINISTERIO DE SALUD:" + "\n");
		System.out.println("Provincia: " + this.provincia);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Ministro: " + this.ministro + "\n");

		System.out.println();
		for (Hospital h : hospitales) {
			h.mostrar();
		}
	}

}