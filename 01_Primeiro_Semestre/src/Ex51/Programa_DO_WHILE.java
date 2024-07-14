package Ex51;

import java.util.Scanner;

public class Programa_DO_WHILE {
	
	// 26 - Crie um programa que utilize essa classe para cadastrar 5 clientes
	// em uma lista de clientes (array). Ao final exibir apenas os clientes
	// que têm idade superior a 18 anos. (Use o DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente[] clientes = new Cliente[5];
		
		int i = 0, f = 0;
		
		do {
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
			
		} while (i <= 4);
		
		System.out.printf("\nLista dos clientes que tem mais de 18 anos:");
		
		do {
			if (clientes[f].idade >= 18)
				System.out.print("\nClientes: " + clientes[f].nome);
			f++;
		} while (f <= 4);

		scanner.close();
	}

}
