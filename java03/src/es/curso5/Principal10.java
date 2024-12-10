package es.curso5;

import java.util.ArrayList;

public class Principal10 {

	public static void main(String[] args) {
		
	
		ArrayList<Integer> lista= new ArrayList<Integer>();
		lista.add(5);
	
		lista.add(3);
		int mayor=0;
		for (int i=0;i<lista.size();i++) {
			
			if(mayor<lista.get(i)) 
				mayor=lista.get(i);
			
			//System.out.println("<"+lista.get(i)+">");
		}
		System.out.println(mayor);
		
		
	}
}
