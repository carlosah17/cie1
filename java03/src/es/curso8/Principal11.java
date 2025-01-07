package es.curso8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Principal11 {

	public static void main(String[] args) {

	
		PersonaRepositoryOk2 repo = new PersonaRepositoryOk2();
		
		ArrayList<Persona> lista = repo.buscarTodos();
		for (Persona p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
			
		}

	}

}
