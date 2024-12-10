package es.curso4.cuadrado;

public class Cuadrado {

	private int lado;

	public int getLado1() {
		return lado;
	}

	public void setLado1(int lado) {
		this.lado = lado;
	}
	
	public int getLado2() {
		return lado;
	}

	public void setLado2(int lado) {
		this.lado = lado;
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;         
	}
}
