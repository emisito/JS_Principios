package Programacion_con_Jhonatan;
import java.time.Year;
import java.util.Scanner;

public class PracticaJonathan4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduzaca el año de su nacimiento");
		int num1 = scn.nextInt();
		int num2 = (Year.now().getValue() - num1);
		
		
		if (num1 < 2023){
			System.out.println("Usted tiene la edad de " + num2 + " años");
			}else {
			System.out.println("Lo siento, este año no es valido, vuelva a intentarlo");
		}
		
		
	}

}
