package Programacion_con_Jhonatan;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class PracticaFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingesa cualquier número y haremos magia");
		int num1 = scn.nextInt();
		
		
		for (int i = 1; i <= num1; i++ ) {
			System.out.print(i + ",");
			
		}
	}

}
