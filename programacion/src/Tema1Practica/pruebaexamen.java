package Tema1Practica;

import java.util.Scanner;

public class pruebaexamen {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.print("Introduce un número");
		int num1 = scn.nextInt();
		
		System.out.println("Introduce una potencia");
		int potencia = scn.nextInt();
		int resultado = 0;
		System.out.print("El número " + num1 + " elevado a " + potencia);
		
		for(int i = 2; i<= potencia; i++) {
			num1 = i * num1;
		}
		System.out.print(" eS igual a " + num1);
	}

}
