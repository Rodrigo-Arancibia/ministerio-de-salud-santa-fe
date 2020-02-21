package ar.com.hospitales.accesoDatos;

public class Controller {
	
    public static final MinisterioSaludController ministerio =
    		new MinisterioSaludController(new MySqlTransaccionHospital());

}