package Proyectos;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Número entero A? ");
		double num1 = sc.nextInt();
		
		System.out.print("¿Número entero B? ");
		double num2 = sc.nextInt();
		
		System.out.println("NÚMER0S CON 2 DÍGITOS DECIMALES:\n" + "A = " + num1 + "\nB = " + num2);
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

	}

}
