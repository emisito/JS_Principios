package JavaProjectComentarios;

import java.util.Scanner;

/**
 * Esta es la unica clase de mi programa por ejemplo
 * Eyeyeye porfavor sal bien
 */

public class intentocometario1 {
	/**
	 * Este metodo es el punto de entrada de mi programa 
	 */	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Pido al usuario el primer numero
	    System.out.print("Ingrese un número entero: ");
	    int num1 = scn.nextInt();
	    //Hago el super calculo
	    int i = 0;
	    
	    while (num1>0) {
	      
	      num1= num1 / 10;
	      
	      i++;
	    }
	    System.out.println("El número tiene " + i + " dígitos.");
	}

}
