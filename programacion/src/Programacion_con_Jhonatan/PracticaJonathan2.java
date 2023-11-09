package Programacion_con_Jhonatan;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class PracticaJonathan2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cualquier número, da igual si es negativo o positivo");
			int num = sc.nextInt();
			
		if (num > 0) {
			System.out.println("Este es un numero positivo " + num);
		}else if (num == 0) {
			System.out.print("0 es igual a " + num);
		}else {
			System.out.print("Este numero es negativo :("  + num);
		}
	}

}
