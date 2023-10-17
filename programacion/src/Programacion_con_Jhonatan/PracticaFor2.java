package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingresa el número que menos te gusta");
		int num1 = scn.nextInt();
		int suma = 0; 
		
		for (int i = 1; i <= num1; i++) {
			if (i%2 == 0) {	
				suma = suma + i;
			}		
		}
		System.out.print(suma);
	}

}
