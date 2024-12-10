package es.curso4.cuadrado;

public class Principal2 {

	public static void main(String[] args) {
		
		
	 CuadradoMalo c1= new CuadradoMalo();
	 c1.setLado1(2);
	 System.out.println(c1.area());
	 c1.setLado2(3);
	 System.out.println(c1.area());
	
	 System.out.println(c1.getLado1());
	 System.out.println(c1.getLado2());

	}

}
