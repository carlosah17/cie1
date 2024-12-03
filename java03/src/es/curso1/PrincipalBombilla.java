package es.curso1;

public class PrincipalBombilla {

	public static void main(String[] args) {
		Bombilla b = new Bombilla();
		b.incrementar();
		b.incrementar();
		System.out.println(b.getIntensidad());
		b.decrementar();
		System.out.println(b.getIntensidad());

	}

}
