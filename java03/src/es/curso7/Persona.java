package es.curso7;

public class Persona {
	
	private String nombre;
	private int edad;
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad=edad;
	}
	
	public void andar() {
		System.out.println("anda a 5 km/hora");
	}


}
