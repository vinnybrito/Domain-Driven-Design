package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex35DW {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// 35. Entrar via teclado com um valor qualquer. Travar a digitação,
		// no sentido de aceitar somente valores positivos. Após a digitação,
		// exibir a tabuada do valor solicitado, no intervalo de um a dez.(DO WHILE)
		
		int n;
		
		do {
			
			System.out.print(" Digite um valor a ser multiplicado: ");
			n = read.nextInt();
			
			if (n < 0) {
				System.out.print("ERRO! Valor precisa ser positivo.");
			}
			
		} while (n < 0);
		
		int i = 1, r;
		
		do {
			
			r = n * i;
			System.out.printf("\n%d X %d = %d", n, i, r);
			i += 1;
			
		} while (i <= 10);

	}

}
