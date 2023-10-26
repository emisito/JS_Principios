package buclesaAnidados;

import java.util.Scanner;

public class Practicasbucles6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce 3 números y presiona enter despúes de introducir uno ponlos en orden decendiente o no :d");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		
		if (num1 < num2 && num2 < num3) {
			System.out.println("Estan en orden creciente " + num1 + " " + num2 + " " + num3);
		}else if (num1 > num2 && num2 > num3) {
			System.out.println("Estan en orden decendiente " + num1 + " " + num2 + " " + num3);
		}else {
			System.out.println("No están en orden creciente ni decreciente");
		}
		
	}

}
