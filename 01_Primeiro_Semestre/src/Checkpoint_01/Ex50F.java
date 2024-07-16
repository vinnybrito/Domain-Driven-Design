package Checkpoint_01;

import java.util.Scanner;

public class Ex50F {
	
	// 50 - Crie um programa que receba dois números inteiros do usuário e 
	// calcule a quantidade de números pares e ímpares no intervalo entre esses
	// dois números (inclusive). O programa deve garantir que os números fornecidos
	// pelo usuário sejam diferentes. (Use o FOR)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int par = 0, impar = 0, inicio, fim;
		
		System.out.printf("Digite um valor qualquer(A): ");
		int a = scanner.nextInt();
		
		System.out.printf("Digite um valor qualquer(B): ");
		int b = scanner.nextInt();
		
		while (a == b) {
			System.out.printf("Os valores não podem ser iguais.\nDigite um valor qualquer(B): ");
			b = scanner.nextInt();
		}
        
        if (a < b) {
            inicio = a;
            fim = b;
        } else {
            inicio = b;
            fim = a;
        }
        
        for (int i = inicio; i <= fim; i++) {
            if ((i % 2) == 0)
            	par++;
            else
                impar++;
        }
		
		System.out.print("\nA quantidade de números pares é: " + par);
		System.out.print("\nA quantidade de números ímpares é: " + impar);

		scanner.close();
	}
	
}
