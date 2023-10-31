package Tema1Practica;

import java.util.Scanner;

public class EjerciciosIfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int num1 = scn.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("Su número es par :D");
		}else {
			System.out.println("Su número es impar :(");
		}
	}

}
