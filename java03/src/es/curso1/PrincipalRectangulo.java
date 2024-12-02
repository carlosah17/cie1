package es.curso1;

import es.curso.negocio.Rectangulo;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		
		Rectangulo r1= new Rectangulo();
		r1.lado1=2;
		r1.lado2=3;
		

		Rectangulo r2= new Rectangulo();
		r2.lado1=2;
		r2.lado2=3;
		
		
		Rectangulo r3= new Rectangulo();
		r3.lado1=2;
		r3.lado2=3;
		
		Rectangulo r4= new Rectangulo();
		r4.lado1=2;
		r4.lado2=3;
		
		Rectangulo[] lista= new Rectangulo[] {r1,r2,r3,r4};
		double areaTotal=0;
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i].calcularArea());
			areaTotal=areaTotal+ lista[i].calcularArea();
		}
		System.out.println(areaTotal);
	}

}
