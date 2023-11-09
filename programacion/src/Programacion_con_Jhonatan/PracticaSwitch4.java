package Programacion_con_Jhonatan;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class PracticaSwitch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("|Mostrar mas informaciín | Editar perfil | Salir|");
		System.out.println("|             1          |       2       |   3  |");
		
		int num1 = scn.nextInt();
		
		if (num1 < 4) {
			switch (num1) {
			case 1:
				System.out.println("Acaba de entrar en Mostrar mas informaciín");
				break;
			case 2:
				System.out.println("Acaba de entrar en Editar perfil");
				break;
			case 3:
				System.out.println("Acaba de Salir del programa");
				break;
			}
		}else {
				System.out.println("Introduzca un número valido");
		}
	}
		
}
