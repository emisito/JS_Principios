package Proyectos;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Número entero A? ");
		int num1 = sc.nextInt();
		
		System.out.print("¿Número entero B? ");
		int num2 = sc.nextInt();
		
		System.out.printf("ANTES DEL INTERCAMBIO:\nA = " + num1 + " y " + "B = " + num2);
		System.out.printf("\nDESPUÉS DEL INTERCAMBIO:\nA = " + num2 + " y " + "B = " + num1);
		
		
	}

}
