package es.curso4;

public class Principal2 {

	public static void main(String[] args) {
		
		Factura f1= new Factura(2,200);
		
		System.out.println(f1.getNumero());
		System.out.println(f1.getImporte());
		
		System.out.println(f1.getImporteConIVA());

	}

}
