package Programacion_con_Jhonatan;
import java.util.Random;
import java.util.Scanner;
/* En este programa tienes que adivinar el numero aleatorio*/
public class PracticaWhile4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int aleatorio = random.nextInt(101);
		Scanner scn = new Scanner(System.in);
		System.out.println("Adivina el número :) este es aleatorio entre 1 y 100");	
    	int num1 = scn.nextInt();  	
    	
	    while(num1 != aleatorio) {
	    	
	    	if (num1 < aleatorio){
	    		System.out.println("Este número es menor que el número generado, sube un poco, vuelve a introducirlo");
	    	}else if (num1 > aleatorio) {
	    		System.out.println("Este número es mayor que el número generado, baja un poco, vuelve a introducirlo");
	    	}
	    	
	    	num1 = scn.nextInt();
	    }
	    
	    System.out.println("Felicidades Acertaste");
	    
	 }

}


