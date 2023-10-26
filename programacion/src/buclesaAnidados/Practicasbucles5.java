package buclesaAnidados;

import java.util.Scanner;

public class Practicasbucles5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce 3 números y presiona enter despúes de introducir uno");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " es el número maximo");
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " es el número mas maximo");
		}else {
			System.out.println(num3 + " es el número mas maximo");
		}
		
		
	}

}
