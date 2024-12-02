package es.curso1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("dame el importe de la factura");
		Scanner sc= new Scanner(System.in);
		int importe= sc.nextInt();
		System.out.println(importe);
		double importeConIva= importe *1.21;
		System.out.println(importeConIva);
		double importeRetencion= importe *0.15;
		System.out.println(importeRetencion);

	}

}
