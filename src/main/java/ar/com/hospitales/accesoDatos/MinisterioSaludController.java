package ar.com.hospitales.accesoDatos;

import ar.com.hospitales.modelo.AltaComplejidad;
import ar.com.hospitales.modelo.AtencionPrimaria;
import ar.com.hospitales.modelo.Hospital;

public class MinisterioSaludController {

	private TransaccionGenericaHospital transaccionGenericaHospital;

	public MinisterioSaludController(TransaccionGenericaHospital transaccionador) {
		this.transaccionGenericaHospital = transaccionador;
	}


	private boolean agregarHospital(Hospital h) {
		// llamada al metodo para guardar los datos. Me conecto a la capa de datos.

		if (h instanceof AltaComplejidad) {
			
			try {
				return transaccionGenericaHospital.guardar_H_AC(((AltaComplejidad) h));
			
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (h instanceof AtencionPrimaria) {
			
			try {
				return transaccionGenericaHospital.guardar_H_AP(((AtencionPrimaria) h));
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	// ******************************************************************************************
	// CREACION HOSPITAL ALTA COMPLEJIDAD:
	
	public boolean crearHospitalAltaComplejidad(String nombre, String domicilio, String director, int capacidad,
			String especialidad, int cantCamas) {

		Hospital altaComplejidad = new AltaComplejidad();

		altaComplejidad.setNombre(nombre);
		altaComplejidad.setDomicilio(domicilio);
		altaComplejidad.setDirector(director);

		((AltaComplejidad) altaComplejidad).setCapacidad(capacidad);
		((AltaComplejidad) altaComplejidad).setEspecialidad(especialidad);
		((AltaComplejidad) altaComplejidad).setCant_camas(cantCamas);;
		
		// Llamo al metodo para almacenar en la base de datos el cual retorna true si se agrego correctamente
		// y caso contrario false.
		return this.agregarHospital(altaComplejidad);

	}

	// ******************************************************************************************
	// CREACION HOSPITAL ATENCION PRIMARIA :

	public boolean crearHospitalAtencionPrimaria(String nombre, String domicilio, String director, int capacidad,
			boolean tieneLaboratorio, boolean tieneRadiologia, boolean tieneVacunatorio) {

		Hospital atencionPrimaria = new AtencionPrimaria();

		atencionPrimaria.setNombre(nombre);
		atencionPrimaria.setDomicilio(domicilio);
		atencionPrimaria.setDirector(director);

		((AtencionPrimaria) atencionPrimaria).setCapacidad(capacidad);
		((AtencionPrimaria) atencionPrimaria).setTieneLaboratorio(tieneLaboratorio);
		((AtencionPrimaria) atencionPrimaria).setTieneRadiologia(tieneRadiologia);
		((AtencionPrimaria) atencionPrimaria).setTieneVacunatorio(tieneVacunatorio);
		
		// Llamo al metodo para almacenar en la base de datos el cual retorna true si se agrego correctamente
		// y caso contrario false.
		return this.agregarHospital(atencionPrimaria);
	}
	
}