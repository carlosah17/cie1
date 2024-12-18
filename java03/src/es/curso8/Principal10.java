package es.curso8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal10 {

	public static void main(String[] args) {

		PersonaRepositoryOk repo = new PersonaRepositoryOk();
		Persona p = new Persona("pepe");
		// el metodo nuestro de buscarTodos
			// los datos
		ResultSet rs = repo.buscarTodos();

		
		generaficheropersonas(rs);

	}

	private static void generaficheropersonas(ResultSet rs) {
		try (FileWriter fstream = new FileWriter("personas.txt"); BufferedWriter info = new BufferedWriter(fstream)) {

			while (rs.next()) {
				info.write(rs.getString("nombre"));
				info.write(rs.getString("apellidos"));
				info.write(rs.getInt("edad"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
