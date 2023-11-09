package Programacion_con_Jhonatan;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class PracticaFor5 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un número para comenzar la cuenta atrás");
		int num1 = scn.nextInt();
		
		for (int i = num1; i > 0; i--){
			System.out.print(i + ",");
			
		}
	}
}
