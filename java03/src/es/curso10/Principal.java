package es.curso10;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Conectable> lista=
				new ArrayList<Conectable>();
		
		lista.add(new Tablet());
		lista.add(new Telefono());
		
		for (Conectable d: lista) {
			
			d.on();
		}

	}

}
