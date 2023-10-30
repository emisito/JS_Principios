package Tema1Practica;

import java.util.Scanner;

public class PracticaWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int num1 = scn.nextInt();
		
		int i = 1;
		
		while (i <= num1) {
			System.out.print(i + " ");
			
			i++;
		}
	}

}
