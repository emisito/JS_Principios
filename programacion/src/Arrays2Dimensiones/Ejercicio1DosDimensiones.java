package Arrays2Dimensiones;

/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class Ejercicio1DosDimensiones {

	public static void main(String[] args) {
		
		int matriz1[][] = {
				{1, 10, 3}, 
				{4, 5, 66}, 
				{72, 8, 9}
				};
		int matriz2[][] = {
				{99, 8, 7}, 
				{6, 50, 4}, 
				{3, 23, 1}
				};
		int [][] matriz3 = new int [3][3];
		
		System.out.print("Matriz 1");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for (int h = 0; h < matriz1[i].length; h++) {
				System.out.print(matriz1[i][h] + " ");
			}
		}
		
		System.out.print("\n");
		System.out.print("Matriz 2");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for (int h = 0; h < matriz1[i].length; h++) {
				System.out.print(matriz2[i][h] + " ");
			}
		}
		
		
		System.out.print("\n");
		System.out.print("Resultado");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for (int h = 0; h < matriz1[i].length; h++) {
				int resultado = matriz1[i][h] + matriz2[i][h];
				matriz3[i][h]= resultado;
				System.out.print(matriz3[i][h] + " ");
			}
		}
	}
		
		/*int [] matriz1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] matriz2 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.print("Matriz 1");
		for (int i = 0; i < matriz1.length; i++ ) {
			if (i % 3 == 0) {
				System.out.print("\n");
			}
			System.out.print(matriz1[i] + " ");
		}
		
		System.out.print("\n");
		System.out.print("\nMatriz 2");
		for (int i = 0; i < matriz2.length; i++ ) {
			if (i % 3 == 0) {
				System.out.print("\n");
			}
			System.out.print(matriz2[i] + " ");
		}
		
		System.out.print("\n");
		System.out.print("\nMatriz Suma");
		for (int i = 0; i < matriz2.length; i++ ) {
			if (i % 3 == 0) {
				System.out.print("\n");
			}
			System.out.print((matriz2[i] + matriz1[i]) + " ");
		}*/
		
 
}


