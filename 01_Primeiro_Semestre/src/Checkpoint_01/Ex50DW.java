package Checkpoint_01;

import java.util.Scanner;

public class Ex50DW {
	
	// 50 - Crie um programa que receba dois números inteiros do usuário e 
	// calcule a quantidade de números pares e ímpares no intervalo entre esses
	// dois números (inclusive). O programa deve garantir que os números fornecidos
	// pelo usuário sejam diferentes. (Use o DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, par = 0, impar = 0, inicio, fim;
		
		System.out.printf("Digite um valor qualquer(A): ");
		a = scanner.nextInt();
		
		do {
			System.out.printf("Digite um valor qualquer(B): ");
			b = scanner.nextInt();
		} while (a == b);
        
        if (a < b) {
            inicio = a;
            fim = b;
        } else {
            inicio = b;
            fim = a;
        }
        
        int i = inicio;
        
        do {
        	if ((i % 2) == 0) {
        		par++;
        	} else {
        		impar++;
        	}
        	i++;
        } while (i <= fim);
		
		System.out.print("\nA quantidade de números pares é: " + par);
		System.out.print("\nA quantidade de números ímpares é: " + impar);

		scanner.close();
	}

}
