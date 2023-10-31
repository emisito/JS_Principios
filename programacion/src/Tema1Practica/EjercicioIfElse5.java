package Tema1Practica;

import java.util.Scanner;

public class EjercicioIfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Ingresa un número del 1 al 100, o no");
		int num1 = scn.nextInt();
		
		if (num1 < 101 && num1 > 0) {
			System.out.println("El número esta dentro del rango 1-100");
		}else {
			System.out.println("El número esta fuera del rango 1-100");
		}
	}

}
