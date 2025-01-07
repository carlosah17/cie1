package es.curso10;

public class Telefono extends Dispositivo {

	
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void on() {
		
		System.out.println("encender telefono");
	}
	public void off() {
		
		System.out.println("apagar telefono");
	}
	
}
