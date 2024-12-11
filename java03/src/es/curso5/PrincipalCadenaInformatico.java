package es.curso5;

public class PrincipalCadenaInformatico {

	public static void main(String[] args) {
		
		
		String cadena="hola me llamo pepe y soy informatico";
		
		int contador=0;
		
		for (int i=0;i<cadena.length();i++) {
			
			if (cadena.charAt(i)=='e') {
				contador++;
			}
		}
		System.out.println(contador);

	}

}
