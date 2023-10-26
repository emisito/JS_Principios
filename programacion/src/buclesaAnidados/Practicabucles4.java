package buclesaAnidados;

import java.util.Scanner;

public class Practicabucles4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Cuantos lados iguales tiene el triangulo");
		int lados = scn.nextInt();
		
		if (lados == 1 || lados == 0) {
			System.out.println("Escalaneo");
		}else if ( lados == 3) {
			System.out.println("Equilatero");
		}else if (lados == 2 ) {
			System.out.println("Isoceles");
		}else {
			System.out.println("Un triangulo no puede tener mas de 3 lados diferentes :(");
		}
		
		
	}

}
