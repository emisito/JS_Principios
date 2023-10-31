package Tema1Practica;

import java.util.Scanner;

public class PracticaDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("Ingresa un número");
		int num1 = scn.nextInt();
		int i = 1;
		
		do {
			if (i % 2 == 0) {
				System.out.println(num1 + " + " + i + " = "  + (num1 + i));
			}
			
			i++;
		} while (i <= num1);
	}

}
