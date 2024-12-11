package es.curso6;

public class PrincipalTurista {

	public static void main(String[] args) {
		Turista t= new Turista("pepe");
		
		Maleta m1= new Maleta("samsonite-pro",4);
		Maleta m2= new Maleta("benzi-plus",12);
		
		//t.setMaleta1(m1);
		t.setMaleta2(m2);
		
		System.out.println(t.pesoTotal());

		System.out.println(t.pesoTotal("ligera"));
		
	
		
	}

}
