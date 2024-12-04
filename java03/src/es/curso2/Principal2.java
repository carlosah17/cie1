package es.curso2;

public class Principal2 {

	public static void main(String[] args) {

		String texto = "hola amigos que tal estas";

		for (int i = 0; i < texto.length(); i++) {
			// caracter
			char letra = texto.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
				System.out.println(texto.charAt(i));
		}

	}

}
