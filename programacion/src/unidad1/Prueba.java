package unidad1;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		//Esto es una operacion aritmetica
		/*int numero = 3;
		numero = 8;
		int operacion = numero + 5;
		System.out.println(operacion);*/
		
		
		
		//no se que es esto xd
		/*byte num1 = -12;
		short num2 = 30;
		int num3 = 0;
		long num4 = 6;
		float num5 = num4;
		double num6 = num2;
		System.out.println(num6);*/
		
		
		
		// Concatenar cosas :)
		/*String nombre = "Emanuel Hosu";	
		Integer num1 = 19;
		System.out.println("Mi nombre es " + nombre + " y mi edad es de " + num1 + " años");
		long num2 = num1.longValue();*/
		
		
		
		// Pruebas de Booleans y movidas primitivas xd
		/*Boolean vf;
		vf = true;
		Integer num1 = 19;
		Integer num2 = 20;
		boolean vf;
		vf = num1.equals(8);
		vf = num1.equals(num2);
		int result = num1.compareTo(num2);
		String strNum1 = num1.toString();
	    String strNum2 = num2.toString();
		System.out.println("num1 como cadena: " + strNum1);*/
		
		
		
		// Cosas de prints :)
		/*System.out.print("hola \n");
		System.out.print("mundo \t");*/
		
		
		//Scanners (esta chulo)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int edad1 = sc.nextInt();
		
		Scanner sb = new Scanner(System.in);
		System.out.println("Introduzca otro numero");
		int edad2 = sb.nextInt();
		
		int resultado = edad1 + edad2;
		
		System.out.println("El resultado de su suma es \n" + edad1 + " + " + edad2 + " = " + resultado);
		
				
	}

}
