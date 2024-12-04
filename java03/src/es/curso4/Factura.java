package es.curso4;

public class Factura {

	private int numero;
	private double importe;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Factura(int numero, double importe) {
	
		setNumero(numero);
		setImporte(importe);
	}
	
	public double getImporteConIVA() {
		
		return importe*1.21;
	}
	
	
}
