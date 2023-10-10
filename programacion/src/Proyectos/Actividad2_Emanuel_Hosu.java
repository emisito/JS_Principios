package Proyectos;

import java.util.Scanner;

public class Actividad2_Emanuel_Hosu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Número entero A? ");
		int num1 = sc.nextInt();
		
		System.out.print("¿Número entero B? ");
		int num2 = sc.nextInt();
		
		System.out.print("¿Número entero C? ");
		int num3 = sc.nextInt();
		
		System.out.printf("NÚMEROS ALINEADOS A LA DERECHA: \nA = %5d\nB = %5d\nC = %5d", num1, num2, num3);
		System.out.printf("\nNÚMEROS ALINEADOS A LA IZQUIERDA: \nA = %-1d\nB = %-1d\nC = %-1d", num1, num2, num3);
		
		
	}

}
