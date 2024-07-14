package Ex54;

import java.util.Scanner;

public class Programa_WHILE {
	
	// 54. Crie um programa que utilize essas classes para cadastrar 5 clientes 
	// em uma lista de clientes e pergunte para cada cliente se ele tem ou não
	// conta bancária. Caso o cliente tenha, permita ele cadastrar os dados da
	// conta bancária. Ao final exibir todos os clientes e suas respectivas 
	// contas bancárias, se houver. (use o WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente[] clientes = new Cliente[5];
		
		int i = 0;
		
		while (i <= 4) {
			Cliente cliente = new Cliente();
			
			System.out.print("\nDigite o seu ID: ");
			cliente.id = scanner.nextInt();
			
			System.out.print("Digite o seu Nome: ");
			cliente.nome = scanner.next();
			
			System.out.print("Digite sua idade: ");
			cliente.idade = scanner.nextInt();
			
			System.out.print("Digite o seu e-mail: ");
			cliente.email = scanner.next();
			
			System.out.print("Possui conta bancária? (Sim = s / Não = n): ");
			String option = scanner.next();
			
			if (option.toUpperCase().equals("S")) {
				ContaBancaria conta = new ContaBancaria();
				
				System.out.print("\nAgência: ");
				conta.agencia = scanner.next();
				
				System.out.print("Número: ");
				conta.numero = scanner.next();
				
				System.out.print("Saldo: ");
				conta.saldo = scanner.nextDouble();
				
				cliente.conta = conta;
			} else {
				cliente.conta = null;
			}
			
			clientes[i] = cliente;
			
			System.out.print("\nCliente cadastrado com sucesso!\n");
			i++;
		}
		
		System.out.println("\nClientes cadastrado no sistema:");
		
		i = 0;
		
		while (i <= 4) {
			System.out.println(clientes[i].exibirNomeIdade() + "\n" 
                             + clientes[i].exibirDadosConta());
			i++;
		}


	}

}
