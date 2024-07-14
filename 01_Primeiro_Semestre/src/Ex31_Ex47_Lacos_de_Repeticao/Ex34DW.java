package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex34DW {
	
	// 34. Exibir a tabuada do número cinco no intervalo de um a dez. (DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 1;
		
		do {
			int tabuada = 5 * i;
			System.out.printf("\n5 X %d = %d", i, tabuada);
			i++;
		} while (i <= 10);
	
		scanner.close();

	}

}
