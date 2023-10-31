package Tema1Practica;

import java.util.Scanner;

public class EjercicioSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int num1 = scn.nextInt();
		System.out.println("Ingresa otro número");
		int num2 = scn.nextInt();
		System.out.println("Ingresa un operador");
		char operador = scn.next().charAt(0);
		
		switch (operador) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		}
	}

}
