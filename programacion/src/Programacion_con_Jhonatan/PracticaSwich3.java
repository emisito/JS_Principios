package Programacion_con_Jhonatan;

import java.util.Scanner;

public class PracticaSwich3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Indique que mondea desea cambiar E para euros y D para dolares");
		char moneda = scn.next().charAt(0);
		
		System.out.println("Ingrese la cantidad que desea cambiar");
		double num1 = scn.nextDouble();
		
		System.out.println("Desea cambiarlo a la otra moneda si es que si introduzca S y si no N");
		char respuesta = scn.next().charAt(0);
		
		//Tasa de cambio
		
		double tasa = 1.06;
		double tasa2 = 0.95;
		
		if (respuesta == 's') {
			switch (moneda){
				case 'e':
					System.out.println("La cantidad de " + num1 + " € en dolares seria de " + (num1 * tasa) + "$");
				case 'd':
					System.out.println("La cantidad de " + num1 + " $ en dolares seria de " + (num1 * tasa2) + "€");
			}
		}

		
	}

}
