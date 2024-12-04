package es.curso4;

public class Principal1 {

	public static void main(String[] args) {
		
		Persona p= new Persona("pedro",10);
		Persona p1= new Persona("pedro",10);
		
		imprimir(p);
		imprimir(p1);
 
	}

	private static void imprimir(Persona p) {
		System.out.println(p.getEdad());
		System.out.println(p.getNombre());
	}

}
