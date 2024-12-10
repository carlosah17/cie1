package es.curso5;

public class Principal {

	public static void main(String[] args) {
		
		
		double[] lista= new double[] {3,4,5,6,7};
		
		int i=0;
		double suma=0;
		while (i<lista.length) {
			
			//System.out.println(lista[i]);
			suma=suma+lista[i];
			i++;
		}
		System.out.println(suma);
	}

}
