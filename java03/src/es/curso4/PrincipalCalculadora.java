package es.curso4;

public class PrincipalCalculadora {
	public static void main(String[] args) {

		
		CalculadoraMala1 c=new CalculadoraMala1(2,2);
		
		System.out.println(c.sumar());
		System.out.println(c.restar());
	}
}
