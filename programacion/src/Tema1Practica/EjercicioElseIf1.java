package Tema1Practica;

import java.util.Scanner;

public class EjercicioElseIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Evalua el examen con un número del 1 al 100");
		int nota = scn.nextInt();
		
		if (nota < 60) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspendido");
		}
		
		
	}

}
