package es.curso;

public class Principal17A {

	
	public static void main (String[] args) {
		//objeto
		String texto="hola que tal estas tu hoy";
		int contador=0;
		for (int i=0;i<texto.length();i++) {
			
			if(texto.charAt(i)=='a') {
				System.out.println(texto.charAt(i));
				contador=contador+1;		
			}
		
		}
		System.out.println(contador);	
		
	}
}
