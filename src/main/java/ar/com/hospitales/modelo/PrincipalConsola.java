package ar.com.hospitales.modelo;

public class PrincipalConsola {

	public static void main(String[] args) {
		
		// MINISTERIO DE SALUD:
		
		MinisterioSalud ministerio = new MinisterioSalud();
		
		ministerio.setMinistro("Dra. Andrea Uboldi");
		ministerio.setDomicilio("Juan de Garay 2880");
		ministerio.setProvincia("Santa Fe");
		
		
		// ATENCION PRIMARIA:
		
		String nombreAP = "CEMAFE";
		String domicilioAP = "Mendoza 2419, Santa Fe";
		String directorAP = "Dr. Juan Perez";
		int capacidadAP = 900;
		boolean tieneLaboratorio = true;
		boolean tieneRadiologia = false;
		boolean tieneVacunatorio = true;
		
		
		// ALTA COMPLEJIDAD:
		
		String nombreAC = "Dr. Jose Maria Cullen";
		String domicilioAC = "Av. Gdor. Freyre 2150, Santa Fe";
		String directorAC = "Dra. Maria Arias";
		int capacidadAC = 2700;
		String especialidad = "Traumatologia";
		int cantCamas = 150;
		
		
		ministerio.crearHospitalAltaComplejidad(nombreAC, domicilioAC, directorAC, capacidadAC,
				especialidad, cantCamas);
		
		
		ministerio.crearHospitalAtencionPrimaria(nombreAP, domicilioAP, directorAP,
				capacidadAP, tieneLaboratorio, tieneRadiologia, tieneVacunatorio);
		
		
		ministerio.mostrar();
		
	}
	
}