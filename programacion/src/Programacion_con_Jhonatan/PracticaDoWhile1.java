package Programacion_con_Jhonatan;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
import java.util.Scanner;

public class PracticaDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = scn.nextInt();
		
		int contador = 1;
		
		do {
			System.out.println(num1 + " x " + contador + " = " + contador * num1);
			
			contador++;
		} while (contador <= 10);
		
	}

}
