package Tema1Practica;

import java.util.Scanner;

public class Practica2Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1 = scn.nextInt();
		int i = num1;
		
		while (i > 0) {
			System.out.println(num1 + " * " + " 10 " + " = " + (num1 * 10));
			System.out.println("Vuelva a introducir otro número");
			i = scn.nextInt();
		}

	}

}
