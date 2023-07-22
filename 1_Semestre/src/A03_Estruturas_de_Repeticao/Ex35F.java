package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex35F {

	public static void main(String[] args) {
		// 35. Entrar via teclado com um valor qualquer. Travar a
		// digitação, no sentido de aceitar somente valores positivos.
		// Após a digitação, exibir a tabuada do valor solicitado, no
		// intervalo de um a dez. (FOR)
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um valor a ser multiplicado: ");
		int n = read.nextInt();
		
		while (n < 0) {
			System.out.print("ERRO! O valor precisa ser positivo. "
					       + "\nDigite novamente: ");
			n = read.nextInt();
		}
		
		int i, r;
		
		for (i = 1; i <= 10; i++) {
			r = n * i;
			System.out.printf("\n%d X %d = %d", n, i, r);
		}
		

	}

}
