package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scn = new Scanner(System.in);
			System.out.println("Introduce un número");
			int num1 = scn.nextInt();
			int i = 1;
			int resultado = 1;
			
			do {
				if (i % 2 == 0) {
					resultado = resultado * i;
					System.out.println(num1 + " + " + resultado + " = " + (num1 + resultado) );
				}
				
				
				resultado = 1;
				i++;
			} while(i <= num1);
			
				
	}

}
