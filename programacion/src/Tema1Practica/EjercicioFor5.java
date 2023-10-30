package Tema1Practica;

import java.util.Scanner;

public class EjercicioFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Intoduce un número");
		int num1 = scn.nextInt();
		
		for (int i = num1; i > 0; i--) {
			System.out.print(i + " ");
		}
		
	}

}
