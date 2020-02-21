package ar.com.hospitales.modelo;

public class AtencionPrimaria extends Hospital {

	private int capacidad;
	private boolean tieneLaboratorio;
	private boolean tieneRadiologia;
	private boolean tieneVacunatorio;

	public AtencionPrimaria() {
		super();
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean getTieneLaboratorio() {
		return tieneLaboratorio;
	}

	public void setTieneLaboratorio(boolean tieneLaboratorio) {
		this.tieneLaboratorio = tieneLaboratorio;
	}

	public boolean getTieneRadiologia() {
		return tieneRadiologia;
	}

	public void setTieneRadiologia(boolean tieneRadiologia) {
		this.tieneRadiologia = tieneRadiologia;
	}

	public boolean getTieneVacunatorio() {
		return tieneVacunatorio;
	}

	public void setTieneVacunatorio(boolean tieneVacunatorio) {
		this.tieneVacunatorio = tieneVacunatorio;
	}
	
	
	@Override
	public void mostrar() {
		System.out.println("HOSPITAL ATENCION PRIMARIA:" + "\n");

		System.out.println("Nombre: " + nombre);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("Director: " + director);

		System.out.println("Capacidad: " + capacidad);
		System.out.println("Tiene Laboratorio: " + (tieneLaboratorio ? "SI" : "NO"));
		System.out.println("Tiene Radiologia: " + (tieneRadiologia ? "SI" : "NO"));
		System.out.println("Tiene Vacunatorio: " + (tieneVacunatorio ? "SI" : "NO") + "\n" + "\n");
	}
}