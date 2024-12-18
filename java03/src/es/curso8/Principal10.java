package es.curso8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal10 {

	public static void main(String[] args) {

		// instancio el repositorio
		PersonaRepositoryOk repo = new PersonaRepositoryOk();
		//llamo al metodo buscarTodos()
		// ese metodo devuelve un resultSet
		// lo asocio
		ResultSet rs = repo.buscarTodos();

		//ya tengo un resultset 
		//lo recorro como lo recorri otras veces 
		try {
			while (rs.next()) {

				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));
				System.out.println(rs.getInt("edad"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
