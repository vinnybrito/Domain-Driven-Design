package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, r;
		
		n = 5;
		i = 1;
		
		while (i < 11) {
			r = n * i;
			System.out.printf("\n%d X %d = %d", n, i, r);
			i = i + 1;
		}

	}

}
