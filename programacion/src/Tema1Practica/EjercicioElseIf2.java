package Tema1Practica;

import java.util.Scanner;

public class EjercicioElseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Introduce un número ya sea positivo o negativo");
		int num1 = scn.nextInt();
		
		if (num1 < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
		
	}

}
