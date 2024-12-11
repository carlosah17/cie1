package es.curso6;

public class Turista {

	private String nombre;
	private Maleta maleta1;
	private Maleta maleta2;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Maleta getMaleta1() {
		return maleta1;
	}

	public void setMaleta1(Maleta maleta1) {
		this.maleta1 = maleta1;
	}

	public Maleta getMaleta2() {
		return maleta2;
	}

	public void setMaleta2(Maleta maleta2) {
		this.maleta2 = maleta2;
	}

	public Turista(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
