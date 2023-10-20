package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaWhile3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	    System.out.print("Ingrese un número entero: ");
	    int num1 = scn.nextInt();

	    int i = 0;

	    while (num1>0) {
	      
	      num1= num1 / 10;
	      
	      i++;
	    }
	    System.out.println("El número tiene " + i + " dígitos.");
	  }
	}


