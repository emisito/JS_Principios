package Tema1Practica;

import java.util.Scanner;

public class PracticaWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un número entero");
		int num1 = scn.nextInt();
		int contador = 0;
		
		System.out.print("El " + num1);
		
		while (num1 > 0) {
			
			num1 = num1/10;
			
			contador ++;
		}
		System.out.print(" cuenta con " + contador + " digitos");
	}

}
