package ar.com.hospitales.modelo;

public abstract class Hospital {

	protected String nombre;
	protected String domicilio;
	protected String director;

	
	public Hospital() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public abstract void mostrar();
	
}