package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex34W {
	
	// 34. Exibir a tabuada do número cinco no intervalo de um a dez. (WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 1;
		
		while (i <= 10) {
			int tabuada = 5 * i;
			System.out.printf("\n5 X %d = %d", i, tabuada);
			i++;
		}
		
		scanner.close();
	}

}