package Programacion_con_Jhonatan;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class PracticaWhile1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Ingrese un número para comenzar con la cuenta");
		int num1 = scn.nextInt();
		int i = 1;
		
		while (i <= num1) {
			System.out.print(i + ",");
			
			
			i++;
		}
	}

}
