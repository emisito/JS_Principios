package Tema1Practica;

import java.util.Scanner;

public class EjercicioBuclesAnidados1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Ingresa un número");
		
		int num1 = scn.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			for (int h = 1; h <= i; h++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
