package Tema1Practica;

import java.util.Scanner;

public class EjercicioFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Ingresa un número positivo");
		int num1 = scn.nextInt();
		int resultado = 1;
		
		for (int i = 1; i < num1; i++) {
			
			resultado = resultado * i;
			System.out.println("Los resultados factoriales son " + (resultado * num1));
		}
	}

}
