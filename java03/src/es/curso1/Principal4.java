package es.curso1;

public class Principal4 {

	public static void main(String[] args) {

	
		int sumaTotal=sumar3(2,3,4);
		
		System.out.println(sumaTotal);
		
		System.out.println(sumaNTerminos(4));
	}

	public static int sumar3(int n1,int n2,int n3) {

		return n1+n2+n3;
	}
	
	public static int sumaNTerminos(int n) {
		
		int suma=0;
		for (int i=0;i<n;i++) {
			
			suma=suma+i;
		}
		return suma;
	}
	
	

}
