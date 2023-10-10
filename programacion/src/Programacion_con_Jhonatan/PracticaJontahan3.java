package Programacion_con_Jhonatan;

import java.util.Scanner;
	
public class PracticaJontahan3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce cualquier número y yo te dire si es par o impar :)");
			int num1= sc.nextInt();
			int num2= num1 % 2;
			
		if(num2 == 0) {
			System.out.println("Este número " + num1 + " es par ");
		}else {
			System.out.println("Este número " + num1 + " es impar ");
		}
			
	}

}
