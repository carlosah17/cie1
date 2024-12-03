package es.curso1;

import es.curso.negocio.Persona;

public class Principal6 {

	public static void main(String[] args) {
		
		
		Persona p= new Persona();
		p.nombre="pepe";
		p.edad=20;
		
		
		Persona p1= new Persona();
		p1.nombre="pepe1";
		p1.edad=21;
		Persona[] lista = new Persona[] {p,p1};

		System.out.println(p.nombre);
		System.out.println(p.edad);
		
		
		for (int i =0;i<lista.length;i++) {
		
			System.out.println(lista[i].nombre);
			System.out.println(lista[i].edad);
			
		}
	}

}
