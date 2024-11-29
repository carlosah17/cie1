package es.curso;

public class Principal15 {

	public static void main(String[] args) {
		
		String[] lista= new String[] {"hola","que","tal","estas"};
		
		System.out.println("vamos a hacer un bucle");
		for (int i=0;i<lista.length;i++) {
			System.out.println("sacame cada palabra :"+ lista[i]);
			
			for (int j=0;j<lista[i].length();j++) {
				
				//sacame cada letra
				
				char caracter= lista[i].charAt(j);
				System.out.println("letra :"+caracter);
				//System.out.println(lista[i].charAt(j));
			}
			System.out.println();
		}
		
	}

}
