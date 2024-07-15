package Ex08_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex29 {
	
	// 29. Escreva um algoritmo que leia três valores inteiros e 
	// diferentes e mostre-os em ordem decrescente.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int v3 = scanner.nextInt();
		
		if ((v1 > v2) && (v1 > v3)) {
			if (v2 > v3)
				System.out.printf("Ordem decrescente: %d, %d, %d", v1, v2, v3);
			else
				System.out.printf("Ordem decrescente: %d, %d, %d", v1, v3, v2);
		} else if ( (v2 > v1) && (v2 > v3) ) {
			if (v1 > v3)
				System.out.printf("Ordem decrescente: %d, %d, %d", v2, v1, v3);
			else
				System.out.printf("Ordem decrescente: %d, %d, %d", v2, v3, v1);
		} else {
			if (v1 > v2) 
				System.out.printf("Ordem decrescente: %d, %d, %d", v3, v1, v2);
			else
				System.out.printf("Ordem decrescente: %d, %d, %d", v3, v2, v1);
		}
		
		scanner.close();
	}

}
