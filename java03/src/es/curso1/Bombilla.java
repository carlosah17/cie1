package es.curso1;

public class Bombilla {
	// propiedad de la clase o el objeto
	private int intensidad;

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int i) {
		if (i >= 0 && i <= 3)
			intensidad = i;
	}

	public void incrementar() {

		setIntensidad(intensidad+1);
		//intensidad = intensidad + 1;
	}

	public void decrementar() {
		setIntensidad(intensidad-1);
		//intensidad = intensidad - 1;
	}

}
