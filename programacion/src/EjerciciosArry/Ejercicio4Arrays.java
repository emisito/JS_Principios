package EjerciciosArry;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4Arrays {

	public static void main(String[] args) {
		
		// PARA GENERAR ARRAYS RANDOMS
		
		/*Random r1 = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
		    array[i] = r1.nextInt(1, 100);
		}*/

		int[] array = new int[] {1, 2, 3, 4, 5};
        
        Scanner scn = new Scanner (System.in);
        System.out.println("Introduce un número a ver si esta en la array :)");
        int num1 = scn.nextInt();
        
        for (int i = 0; i < array.length; i++) {
        	int posicion = array[i];
        	
        	System.out.println((i - 1));
        }
		
	}
}
