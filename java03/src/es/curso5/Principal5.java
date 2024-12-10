package es.curso5;

public class Principal5 {
	public static void main(String[] args) {

		String[] lista= new String[] {"hola","que","tal","estas"};
		int i=0;
		int letras =0;
		int posicion=0;
		while(i<lista.length) {
			
			System.out.println(lista[i]);
			System.out.println(lista[i].length()); 
			
			if (letras<lista[i].length()) {
				letras=lista[i].length();
				posicion=i;
			}
			i++;
		}
		System.out.println("mayor numero letras :"+ letras);
		System.out.println("la palabra es :"+ lista[posicion]);
	}
}
