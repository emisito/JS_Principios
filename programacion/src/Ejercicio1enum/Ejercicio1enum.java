package Ejercicio1enum;

import java.util.Scanner;
/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class Ejercicio1enum {
	
	enum DiaSemana {
	    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
	public static void main(String[] args) {
		   Scanner scn = new Scanner(System.in);

           System.out.println("Ingrese un número entre 1 y 7:");
           int num = scn.nextInt();

           if(num>=8 || num<=0) {
               System.out.println("Número invalido, vuelva a introducirlo");
           }else {


           DiaSemana dia = DiaSemana.values()[num - 1];
           System.out.println("El dia de la semana correspondiente al número " + num + " es el " + dia);

       }
   }
		
}


