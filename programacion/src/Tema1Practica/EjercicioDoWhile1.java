package Tema1Practica;

import java.util.Scanner;

public class EjercicioDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int num1 = scn.nextInt();
		
		int multiplicador = 1;
		
		do {
			System.out.println(num1 + " * " + multiplicador + " = " + (num1 * multiplicador));
			
			multiplicador ++;
		} while (multiplicador < 11);
		
				
	}

}
