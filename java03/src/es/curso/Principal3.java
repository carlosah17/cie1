package es.curso;

public class Principal3 {

	public static void main(String[] args) {

		// DRY dibt repeat yourself

		int numero1 = 5;
		int numero2 = 7;
		//invocacion de la funcion
		//asignar resultado
		int resultado1=sumar(numero1, numero2);
		System.out.println(resultado1);

		int numero3 = 8;
		int numero4 = 9;
		//recibo el resultado y lo imprimo
		System.out.println("el resultado de la suma es:"+sumar(numero3, numero4));

	}

	// no es sencillo de entender
	public static int sumar(int n1, int n2) {

		int suma = n1 + n2;

		return suma;
	}

	public static int restar(int n1, int n2) {

		
		int resta = n1 - n2;

		return resta;
	}

}
