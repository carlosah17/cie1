package es.curso;

import es.curso.negocio.Persona;

public class Principal11 {

	public static void main(String[] args) {
		
		
		Persona p= new Persona();
		p.edad=20;
		
		System.out.println(p.esMayorDeEdad());

	}

}
