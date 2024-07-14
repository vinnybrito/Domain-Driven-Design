package Checkpoint_01;

import java.util.Scanner;

public class Ex48DW {

	// 48- Crie um programa em que o usuário entre com um número inteiro qualquer, 
	// e o programa imprima os 20 números subsequentes ao que foi digitado pelo usuário.
	// (use o DO WHILE)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor qualquer: ");
		int valor = scanner.nextInt();
		
		int valorSubsequente = valor + 20;
		int i = valor;
		
		do {
			System.out.println(i);
			i++;
		} while (i <= valorSubsequente);

		scanner.close();
	}

}
