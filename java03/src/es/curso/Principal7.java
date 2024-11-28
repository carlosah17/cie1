package es.curso;

public class Principal7 {

	public static void main(String[] args) {

		int[] lista = new int[] { 2, 5, 6, 7 };

		for (int i = 0; i < lista.length; i++) {

			System.out.println(lista[i]);
		}
		int mayor= numeroMayor(lista);
		int menor= numeroMenor(lista);
		System.out.println("******");
		System.out.println(mayor);
		System.out.println(menor);

	}

	public static int numeroMayor(int[] miArray) {

		int mayor = 0;

		for (int i = 0; i < miArray.length; i++) {

			if (miArray[i] > mayor) {
				mayor = miArray[i];
			}
		}
		return mayor;
	}
	
	public static int numeroMenor(int[] miArray) {

		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < miArray.length; i++) {

			if (miArray[i] <menor) {
				menor = miArray[i];
			}
		}
		return menor;
	}

}
