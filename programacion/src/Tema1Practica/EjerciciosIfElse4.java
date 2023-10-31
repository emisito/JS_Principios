package Tema1Practica;

import java.util.Scanner;

public class EjerciciosIfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Ingrese su año de nacimiento");
		int num1 = scn.nextInt();
		
		if (num1 < 2024) {
			System.out.println("Usted tiene la edad de " + (2023 - num1) + " años");
		}else {
			System.out.println("El año que ha introducido no es corrector");
		}
	}

}
