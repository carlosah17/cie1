package es.curso9;

import java.util.HashMap;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("hola");
		Mesa m= new Mesa(2,"azul");
		Mesa m2= new Mesa(2,"azul");
		
		System.out.println(m==m2);

		System.out.println(m.equals(m2));
		HashMap<String,Mesa> mapa= new HashMap<String,Mesa>();
		mapa.put("1A", m);
		mapa.put("1B", m2);
		
		System.out.println(mapa.get("1A"));
		
		System.out.println("**************");
		
		//conjunto o set no le hemos visto
		// es una lista sin elementos repetidos
		Set<String> claves=mapa.keySet();
		
		for (String clave:claves) {
			
			System.out.println(mapa.get(clave));
		}
		
		
		
		
		
	}

}
