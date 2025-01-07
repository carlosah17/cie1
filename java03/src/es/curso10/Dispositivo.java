package es.curso10;

public abstract class Dispositivo  implements Conectable{

	private String marca;
	
	
	public abstract void on() ;
	public abstract void off() ;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}



}
