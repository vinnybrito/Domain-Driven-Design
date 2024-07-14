package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex23 {
	
	// 23. Faça um algoritmo que leia os valores A, B, C
	// e imprima na tela se a soma de A + B é menor que C.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int b = scanner.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int c = scanner.nextInt();
		
		if ((a + b) < c) 
			System.out.print("A soma dos dois primeiros valores é menor que o terceiro.");
		else
			System.out.print("A soma dos dois primeiros valores é maior que o terceiro.");
		
		scanner.close();
	}

}
