package es.curso1;

import es.curso.negocio.Persona;

public class Principal3 {

	public static void main(String[] args) {
		
		Persona p1= new Persona();
		p1.edad=50;
		p1.nombre="ceci";
		
		Persona p2= new Persona();
		p2.edad=1;
		p2.nombre="catalina";
		
		// es un array
		// llevara corchetes
		// Persona[] milista= new Persona[]{p1,p2};
		Persona[] lista= new Persona[2];
		lista[0]=p1;
		lista[1]=p2;
		
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i].edad);
			System.out.println(lista[i].nombre);
		}
		
		
	

	}

}
