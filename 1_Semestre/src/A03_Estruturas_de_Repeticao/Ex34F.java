package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex34F {

	public static void main(String[] args) {
		// 34. Exibir a tabuada do número cinco no intervalo de um a dez.
		// (FOR)
		
		Scanner read = new Scanner(System.in);
		
		int n = 5, i, r;
		
		for (i = 1; i <= 10; i++) {
			r = n * i;
			System.out.printf("\n%d X %d = %d", n, i, r);
		}

	}

}
