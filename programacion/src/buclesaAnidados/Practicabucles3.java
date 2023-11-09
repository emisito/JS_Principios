package buclesaAnidados;

/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */
public class Practicabucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Se generara una matriz a continuación");
		System.out.println("1  2  3  4  5  6  7  8  9  10");
		System.out.println("-----------------------------");
		
		for (int i = 1; i < 11; i++){
			System.out.println(" ");
			for (int h = 1; h < 11; h++) {
				System.out.print(i * h + "  ");
			}
		}
	}

}
