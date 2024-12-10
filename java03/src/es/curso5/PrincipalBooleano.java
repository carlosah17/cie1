package es.curso5;

public class PrincipalBooleano {

	public static void main(String[] args) {
		
		Ordenador o= new Ordenador(false);
		System.out.println(o.estaEncendido());
		o.encender();
		System.out.println(o.estaEncendido());
		o.apagar();
	}
}
