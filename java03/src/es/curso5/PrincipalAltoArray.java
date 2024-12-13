package es.curso5;

public class PrincipalAltoArray {

	public static void main(String[] args) {
	
		int[] lista= new int[] {5,7,1,2,90};
		
		//tengo la variable mayor que empieza en cero
		int mayor=0;
		
		for (int i=0;i<lista.length;i++) {
			//comparo cero con el valor de la lista
			// si el valor es mayor guardo en la variable mayor
			//lista[i] y continuo con el bucle
			if (mayor<lista[i]) {
				
				mayor=lista[i];
			}
		}

		System.out.println(mayor);
		
	
	}

}	









