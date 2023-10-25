package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaSwitch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduzca una calificación del 1 al 5");
		int nota = scn.nextInt();
		
		if (nota < 6){
			switch (nota) {
				case 1: 
					System.out.println("Suspendido");
					break;
				case 2: 
					System.out.println("Suspendido");
					break;
				case 3: 
					System.out.println("Aprobado");
					break;
				case 4: 
					System.out.println("Notable");
					break;
				case 5: 
					System.out.println("Sobresalietne");
					break;
			}
		}else {
			System.out.println("Introduzca un número valido");
		}
	}

}
