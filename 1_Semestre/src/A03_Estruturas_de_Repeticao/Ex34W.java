package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex34W {

	public static void main(String[] args) {
		// 34. Exibir a tabuada do número cinco no intervalo de um a dez.
		// (WHILE)
		
		Scanner read = new Scanner(System.in);
		int n = 5, i = 0, r;
		
		while (i <= 10) {
			r = n * i;
			System.out.printf("\n%d X %d = %d", n, i, r);
			i = i + 1;
		}	

	}

}
