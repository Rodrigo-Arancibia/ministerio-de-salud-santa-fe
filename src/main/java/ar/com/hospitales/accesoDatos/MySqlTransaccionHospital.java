package ar.com.hospitales.accesoDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.hospitales.modelo.AltaComplejidad;
import ar.com.hospitales.modelo.AtencionPrimaria;

public class MySqlTransaccionHospital implements TransaccionGenericaHospital {

	// ******************************************************************************************
	// GUARDAR HOSPITAL ALTA COMPLEJIDAD:

	@Override
	public boolean guardar_H_AC(AltaComplejidad hospitalAC) throws Exception {
		
		String query = " INSERT INTO alta_complejidad (nombre, domicilio, director, capacidad,"
				+ "especialidad, cantidad_camas) VALUES (?, ?, ?, ?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = AdministradorDeConexiones.getConnection().prepareStatement(query);

		preparedStmt.setString(1, hospitalAC.getNombre());
		preparedStmt.setString(2, hospitalAC.getDomicilio());
		preparedStmt.setString(3, hospitalAC.getDirector());
		preparedStmt.setInt(4, hospitalAC.getCapacidad());
		preparedStmt.setString(5, hospitalAC.getEspecialidad());
		preparedStmt.setInt(6, hospitalAC.getCant_camas());

		// execute the preparedstatement
		boolean devolucion = !preparedStmt.execute();

		// close the connection.
		AdministradorDeConexiones.getConnection().close();

		return devolucion;
	}

	// ******************************************************************************************
	// GUARDAR HOSPITAL ATENCION PRIMARIA:

	@Override
	public boolean guardar_H_AP(AtencionPrimaria hospitalAP) throws Exception {

		String query = " INSERT INTO atencion_primaria (nombre, domicilio, director, capacidad,"
				+ "tiene_laboratorio, tiene_radiologia, tiene_vacunatorio)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = AdministradorDeConexiones.getConnection().prepareStatement(query);

		preparedStmt.setString(1, hospitalAP.getNombre());
		preparedStmt.setString(2, hospitalAP.getDomicilio());
		preparedStmt.setString(3, hospitalAP.getDirector());
		preparedStmt.setInt(4, hospitalAP.getCapacidad());
		preparedStmt.setBoolean(5, hospitalAP.getTieneLaboratorio());
		preparedStmt.setBoolean(6, hospitalAP.getTieneRadiologia());
		preparedStmt.setBoolean(7, hospitalAP.getTieneVacunatorio());

		// execute the preparedstatement
		boolean devolucion = !preparedStmt.execute();

		// close the connection.
		AdministradorDeConexiones.getConnection().close();

		return devolucion;
	}


	// ******************************************************************************************
	// DEVOLVER HOSPITAL ALTA COMPLEJIDAD:

	@Override
	public AltaComplejidad devolver_un_H_AC() throws Exception {

		Statement st = AdministradorDeConexiones.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM alta_complejidad ORDER BY id_alta_complejidad DESC LIMIT 1");

		AltaComplejidad ac = new AltaComplejidad();

		while (rs.next()) {
			String nombre = rs.getString("nombre");
			String domicilio = rs.getString("domicilio");
			String director = rs.getString("director");
			Integer capacidad = rs.getInt("capacidad");
			String especialidad = rs.getString("especialidad");
			Integer cantidadCamas = rs.getInt("cantidad_camas");

			ac.setNombre(nombre);
			ac.setDomicilio(domicilio);
			ac.setDirector(director);
			ac.setCapacidad(capacidad);
			ac.setEspecialidad(especialidad);
			ac.setCant_camas(cantidadCamas);

		}
		return ac;
	}

	// ******************************************************************************************
	// DEVOLVER HOSPITAL ATENCION PRIMARIA:

	@Override
	public AtencionPrimaria devolver_un_H_AP() throws Exception {

		Statement st = AdministradorDeConexiones.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM atencion_primaria ORDER BY id_atencion_primaria DESC LIMIT 1");
		

		AtencionPrimaria ap = new AtencionPrimaria();

		while (rs.next()) {
			String nombre = rs.getString("nombre");
			String domicilio = rs.getString("domicilio");
			String director = rs.getString("director");
			Integer capacidad = rs.getInt("capacidad");
			Boolean tiene_laboratorio = rs.getBoolean("tiene_laboratorio");
			Boolean tiene_radiologia = rs.getBoolean("tiene_radiologia");
			Boolean tiene_vacunatorio = rs.getBoolean("tiene_vacunatorio");
			
			ap.setNombre(nombre);
			ap.setDomicilio(domicilio);
			ap.setDirector(director);
			ap.setCapacidad(capacidad);
			ap.setTieneLaboratorio(tiene_laboratorio);
			ap.setTieneRadiologia(tiene_radiologia);
			ap.setTieneVacunatorio(tiene_vacunatorio);
		}
		
		return ap;
	}
	
}