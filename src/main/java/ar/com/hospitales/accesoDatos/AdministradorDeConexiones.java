package ar.com.hospitales.accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public AdministradorDeConexiones() { }

	public static Connection getConnection() throws Exception {

		// Establece el nombre del driver a utilizar
		String dbDriver = "com.mysql.jdbc.Driver";

		// Establece la conexion a utilizar contra la base de datos
		String dbConnString = "jdbc:mysql://localhost:3312/hospitales";

		// Establece el usuario de la base de datos
		String dbUser = "root";

		// Establece la contrasena de la base de datos
		String dbPassword = "1234";

		// Establece el driver de conexion
		Class.forName(dbDriver).newInstance();

		// Retorna la conexion
		return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
	}
}
