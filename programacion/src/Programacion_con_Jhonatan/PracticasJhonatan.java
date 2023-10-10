package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticasJhonatan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un número del 0 al 100 para clasificar el examen ");
			int num = sc.nextInt();
		
		if (num >= 60){
			System.out.printf("Felicidades, ha aprobado con la nota " + num);
		}else {
			System.out.printf("Que pena, usted ha suspedido con una nota de " + num);
		}
	}

}

