package PracticasMetodos;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class practicaMetodos1 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa una cadena de texto");
		String cadena = scn.nextLine();
		
		int cantidadA = contarAs(cadena);
		
		System.out.println("La cadena tiene " + cantidadA + " A/a");
	
	}
	
	public static int contarAs(String cadena) {
	    int contador = 0;
	    for (int i = 0; i < cadena.length(); i++) {
	        if (cadena.charAt(i) == 'a') {
	            contador++;
	        } else if (cadena.charAt(i) == 'A') {
	        	contador++;
	        }
	    }
	    return contador;
	}
	
}


