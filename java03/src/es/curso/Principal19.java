package es.curso;

public class Principal19 {

	public static void main(String[] args) {
		
		String cadena="hola que tal estas";
	
		//System.out.println(cadena.length());
		//System.out.println(cadena.charAt(i));
	
		int i=0;
		while (i<cadena.length()) {
			
			char letra=cadena.charAt(i);
			
			System.out.println(letra);
			i++;
		}
	}
}
