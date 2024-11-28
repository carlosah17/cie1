package es.curso;

public class Principal5 {

	public static void main(String[] args) {
	
		// numero
		int numero1=2;
	
		
		cambiar(numero1);
		
		System.out.println(numero1);

	}
		//2 pero es una copia del 2 es una nueva variable
	 public static void cambiar(int n1) {
		n1=7;
		System.out.println("cambiado"+n1);
		
	 }

}
