package buclesaAnidados;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class Practicabucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduzca el número que usted desee");
		int num1 = scn.nextInt();
		
		for (int i = 1; i <= num1; i++){
			for (int h = 1; h <= i; h++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
