package Arrays2Dimensiones;

public class Ejercicio2DosDimensiones {

	public static void main(String[] args) {
		
		int matriz1[][] = {
				{1, 11, 43}, 
				{23, 5, 66}, 
				{72, 5, 9}
				};
		
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
				System.out.print(matriz1[h][i] + " ");
			}
		}
		
	}

}
