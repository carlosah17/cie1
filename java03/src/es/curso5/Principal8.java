package es.curso5;

import java.util.ArrayList;

public class Principal8 {

	public static void main(String[] args) {
		
	
		ArrayList<Integer> lista= new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(3);
		System.out.println(lista);
		
		System.out.println("********");
		for (int i=0;i<lista.size();i++) {
			
			System.out.println("<"+lista.get(i)+">");
		}
		System.out.println("********");
		
		
	}
}
