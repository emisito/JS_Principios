package Tema1Practica;

import java.util.Scanner;

public class EjercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int num1 = scn.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			System.out.print(i + " ");
		}
		
	}

}
