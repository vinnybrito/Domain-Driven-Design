package Checkpoint_01;

import java.util.Scanner;

public class Ex49DW {
	
	// 49- Crie um programa que solicite que o usuário entre com dois números 
	// (inicial e final). Ao final o programa deverá apresentar o valor total
	// da soma de todos os números do intervalo digitado pelo usuário.
	// (use o DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
		int valorInicial = scanner.nextInt();
		
		System.out.print("Digite o valor final: ");
		int valorFinal = scanner.nextInt();
		
		int valor = valorInicial - 1;
		
		do {
			valor = valorInicial + valor;
			valorInicial++;
		} while (valorInicial <= valorFinal);

		System.out.print("Soma de todos os números é igual: " + valor);
		
		scanner.close();
	}

}
