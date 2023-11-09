package Programacion_con_Jhonatan;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class PracticaFor4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese un número para calcular su factorial");
		int num1 = scn.nextInt();
		int resultado = 1; 
		
		for(int i = 1; i <= num1; i++){
			resultado = resultado *i;
		}
		
		if (0 > num1) {
			System.out.println("El número no es positivo");
		}else {
			System.out.println("El número " + num1 +" que ha ingresado tiene el factorial de " + resultado );
		}
		
	}
		
} 

