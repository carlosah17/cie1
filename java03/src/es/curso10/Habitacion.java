package es.curso10;

public class Habitacion implements Conectable {

	@Override
	public void on() {
		System.out.println("la habitacion se enciende");
		
	}

	@Override
	public void off() {
		System.out.println("la habitacion se apaga");
		
	}

}
