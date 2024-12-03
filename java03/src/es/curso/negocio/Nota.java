package es.curso.negocio;

public class Nota {

	
	private double valor;
	
	//funcion que nos devuelve el valor como funcion publica
	public double getValor() {
		
		return valor;
	}
	
	public void setValor(double v) {
		if (v>=0 && v<=10)
		valor=v;
	}
}
