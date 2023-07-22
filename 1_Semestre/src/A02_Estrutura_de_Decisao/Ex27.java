package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// 27. Faça um algoritmo que leia uma variável e some 5 caso seja
		// par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um valor qualquer: ");
		int v = read.nextInt();
		
		int r = v % 2;
		
		if (r == 0) {		
			int d = v + 5;
			System.out.printf("%d + 5 = %d", v, d);
		}
		
		else {
			int d = v + 8;
			System.out.printf("%d + 5 = %d", v, d);
		}
		
	}

}
