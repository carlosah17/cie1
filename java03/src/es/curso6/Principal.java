package es.curso6;

public class Principal {

	public static void main(String[] args) {
		
		Monitor m1= new Monitor("lg",200);
		System.out.println(m1.getMarca());
		System.out.println(m1.getPrecio());
		
		CPU cpu1= new CPU("ibm","intel",500);
		System.out.println(cpu1.getMarca());
		System.out.println(cpu1.getProcesador());
		System.out.println(cpu1.getPrecio());
		
		Ordenador o= new Ordenador(m1,cpu1);
		
		// la clase turista y la clase maleta
		// el turista tiene nombre 
		// y las maletas tienen modelo y peso
		//un turista puede llevar 2 maletas
		//cuanto peso soporta el turista
		
		
		

	}

}
