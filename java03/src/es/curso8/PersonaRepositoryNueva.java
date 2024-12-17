package es.curso8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaRepositoryNueva {

	static final String DB_URL = "jdbc:mysql://localhost:8889/cie1";
	static final String USER = "root";
	static final String PASS = "root";
	static final String QUERY = "SELECT * from Personas";

	public void insertar(Persona persona) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			sentencia.executeUpdate("insert into personas values ('" + persona.getNombre() + 
					"','" + persona.getApellidos() + "'," + persona.getEdad() + ")");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrar(Persona persona) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			String consultaBorrar = "delete from Personas where nombre='" + persona.getNombre() + "'";

			System.out.println(consultaBorrar);

			sentencia.executeUpdate(consultaBorrar);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
