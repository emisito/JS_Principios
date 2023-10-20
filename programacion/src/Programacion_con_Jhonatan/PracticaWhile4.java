package Programacion_con_Jhonatan;
import java.util.Random;
import java.util.Scanner;

public class PracticaWhile4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int aleatorio = random.nextInt(101);
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Adivina el número :) este es aleatorio entre 1 y 100");	
    	int num1 = scn.nextInt();
	    
    	if (num1 < aleatorio){
    		System.out.print("Este número es menor que el número generado, sube un poco");
    	}else{
    		System.out.print("Este número es mayor que el número generado, sube un poco");
    	}
	    
	    while(num1 == aleatorio) {
	    	
	    	
	    }
	    
	    
	 }

}


