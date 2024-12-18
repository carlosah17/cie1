package es.curso8;

public class Principal7 {

	public static void main(String[] args) {
		
		PersonaRepositoryNueva repo= new PersonaRepositoryNueva();
		Persona p= new Persona( "juanito1","gomez1",20);
		repo.insertar(p);

	}

}
