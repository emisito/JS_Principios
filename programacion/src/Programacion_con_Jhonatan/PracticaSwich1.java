package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaSwich1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 7");
		int num1 = scn.nextInt();
		
		
		
		if ( num1 <= 7) {
			switch (num1) {
			case 1:
				System.out.print("Lunes");
				break;
			case 2:
				System.out.print("Martes");
				break;
			case 3:
				System.out.print("Mirecoles");
				break;
			case 4:
				System.out.print("Jueves");
				break;
			case 5:
				System.out.print("Viernes");
				break;
			case 6:
				System.out.print("Sabado");
				break;
			case 7:
				System.out.print("Doimingo");
				break;
				
			}
			
			System.out.print(" es el número " + num1 + " de la semana ");
		}else {
			System.out.print("El número no es valido");
		}
		
		
	}

}
