package Ex51;

import java.util.Scanner;

public class Programa_WHILE {
	
	// 26. Crie uma classe conforme o Diagrama de Classe (UML) abaixo. 
	// Crie um programa que utilize essa classe para cadastrar 5 clientes
	// em uma lista de clientes (array). Ao final exibir apenas os clientes
	// que têm idade superior a 18 anos.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente[] clientes = new Cliente[5];
		
		int i = 0, f = 0;
		
		while (i <= 4) {
			Cliente cliente = new Cliente();
			
			System.out.print("\nInsira o seu ID: ");
			cliente.id = scanner.nextInt();
			
			System.out.print("Digite o seu nome: ");
			cliente.nome = scanner.next();
			
			System.out.print("Digite sua idade: ");
			cliente.idade = scanner.nextInt();
			
			System.out.print("Digite o seu e-mail: ");
			cliente.email = scanner.next();
			
			clientes[i] = cliente;
			
			i++;
		}
		
		System.out.printf("\nLista dos clientes que tem mais de 18 anos:");
		
		while (f <= 4) {
			if (clientes[f].idade >= 18)
				System.out.print("\nNome: " + clientes[f].nome);
			f++;
		}
		
		scanner.close();
	}

}
