package es.curso.negocio;

public class Factura {

	public double importe;

	public double calcularConIVA() {
		//acceder a la propiedad
		return importe * 1.21;
	}

	public double calcularSoloIVA() {
		//accedo a la propiedad
		return importe * 0.21;
	}
}
