package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaFor3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Ingrese el número que usted desee");
		int num1 = scn.nextInt();
		
		for (int i = 1; i <= 10 ; i++) {
			
			System.out.println(num1 + " x " + i + " = " + num1 * i);
			
		}
	}

}
