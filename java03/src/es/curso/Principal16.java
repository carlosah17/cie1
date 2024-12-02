package es.curso;

public class Principal16 {

	public static void main(String[] args) {
		
		String cadena="hola que tal estas";
		int contador=0;
		 for (int i=0;i<cadena.length();i++) {
			 
			 if(cadena.charAt(i)=='a') {
			 System.out.println(cadena.charAt(i));
			 contador++;
			 }
		 }
		 
		 System.out.println(contador);
	}
}
