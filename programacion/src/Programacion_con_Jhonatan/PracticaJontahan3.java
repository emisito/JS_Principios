package Programacion_con_Jhonatan;

import java.util.Scanner;
	
public class PracticaJontahan3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce cualquier número y yo te dire si es par o impar :)");
			int num= sc.nextInt();
			int num1= num % 2;
			
		if(num1 == 0) {
			System.out.println("Este número " + num + " es par ");
		}else {
			System.out.println("Este número " + num + " es impar ");
		}
			
	}

}
