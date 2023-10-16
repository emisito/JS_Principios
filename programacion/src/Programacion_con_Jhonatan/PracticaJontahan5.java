package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaJontahan5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Introduzca un número dentro del rango 1 y 100");
		
		int num1 = scn.nextInt();
		
		if (num1 >= 1 && num1 <= 100) {
			System.out.println("El número que ha ingresado " + num1 + " entra dentro del rango el 1 al 100");
		}else {
			System.out.println("Que pena... el número que ha ingresado " + num1 + " está fuera del rango el 1 al 100");
		}
		
		
		

	}

}
