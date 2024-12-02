package es.curso;

public class Principal18 {

	public static void main(String[] args) {
		
		String cadena="hola que x tal estas";
		
		for (int i=0;i<cadena.length();i++) {
			
			if(cadena.charAt(i)=='x' ) 
				System.out.println(i);
			
			//System.out.println(cadena.charAt(i));
		}
	
		
	}
}
