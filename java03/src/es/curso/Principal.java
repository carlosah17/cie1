package es.curso;

public class Principal {

	public static void main(String[] args) {
		
	//DRY dibt repeat yourself
		
		int numero1=5;
		int numero2=7;
		
		int suma= 5+7;
		System.out.println(suma);
		
		int numero3=8;
		int numero4=9;
		
		int suma2= numero3+numero4;
		
		System.out.println(suma2);
		
		
		

	}
	// no es sencillo de entender
	public static int sumar(int n1,int n2) {
		
		int suma=n1+n2;
		return suma;
	}
	

}
