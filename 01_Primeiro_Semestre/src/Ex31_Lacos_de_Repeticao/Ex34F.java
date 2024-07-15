package Ex31_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex34F {
	
	// 34. Exibir a tabuada do número cinco no intervalo de um a dez. (FOR)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			int tabuada = 5 * i;
			System.out.printf("\n5 X %d = %d", i, tabuada);
		}
		
		scanner.close();
	}

}
