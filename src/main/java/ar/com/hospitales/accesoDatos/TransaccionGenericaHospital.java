package ar.com.hospitales.accesoDatos;

import ar.com.hospitales.modelo.AltaComplejidad;
import ar.com.hospitales.modelo.AtencionPrimaria;

public interface TransaccionGenericaHospital {
	
	// Persisto los datos:
	
	public boolean guardar_H_AC(AltaComplejidad hospitalAC) throws Exception;
	
	public boolean guardar_H_AP(AtencionPrimaria hospitalAP) throws Exception;
	
	
	// Devuelvo los datos:
	
	public AltaComplejidad devolver_un_H_AC() throws Exception;
	
	public AtencionPrimaria devolver_un_H_AP() throws Exception;
	
}