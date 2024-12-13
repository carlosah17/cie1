package es.curso6;

import java.util.ArrayList;

public class PrincipalTuristaRico {

	public static void main(String[] args) {
		// construimos un objeto TuristaRico
		// en el constructor asignamos nombre
		// la variable es pepito
		TuristaRico pepito= new TuristaRico("pepito");
		
		// creamos dos maletas con sus parametors
		Maleta m1= new Maleta("sansonite",10);
		Maleta m2= new Maleta("benzi",5);
		
		//usamos el metodo addmaleta de la clase TuristaRico
		//para añadir a pepit odos maletas
		pepito.addMaleta(m1);
		pepito.addMaleta(m2);
		
		//llamo al getMaletas de pepito y asigno la variable maletas
		ArrayList<Maleta> maletas= pepito.getMaletas();
		
		for (int i=0;i<maletas.size();i++) {
			//sacarlo del armario
			Maleta maletaR=maletas.get(i);
			
			System.out.println(maletaR.getModelo());
			System.out.println(maletaR.getPeso());
			
			//subir al armario
			System.out.println(maletas.get(i).getModelo());
			System.out.println(maletas.get(i).getPeso());
			
			
		}
		
		

	}

}
