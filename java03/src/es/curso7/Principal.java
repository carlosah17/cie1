package es.curso7;

public class Principal {

	public static void main(String[] args) {

		DeportistaPro deportista =

				new DeportistaPro("pepe", 20, "tenis", 1);

		System.out.println(deportista.getDeporte());
		deportista.andar();

		Deportista deportistaNormal = new Deportista("ana", 30, "baloncesto");
		deportistaNormal.andar();
		
		Persona p= new Persona("gema",20);
		p.andar();
	}

}
