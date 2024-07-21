package Ex55_Encapsulamento;

import java.util.Scanner;

public class Programa_FOR {
	
	// 55. Crie as classes conforme o Diagrama de Classe (UML) abaixo. 
	// Crie Getters e Setters para todos os atributos das classes. 
	// Crie um programa que utilize essas classes para cadastrar 5 clientes 
	// em uma lista de clientes e pergunte para cada cliente se ele tem ou não
	// conta bancária. Caso o cliente tenha, permita ele cadastrar os dados da
	// conta bancária. Ao final exibir todos os clientes e suas respectivas 
	// contas bancárias, se houver. (use o FOR e o modificador de acesso private)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente[] clientes = new Cliente[2];
		
		for (int i = 0; i <= 1; i++) {
			Cliente cliente = new Cliente();
			
			System.out.print("\nDigite o seu ID: ");
			cliente.setId(scanner.nextInt());
			
			System.out.print("Digite o seu Nome: ");
			cliente.setNome(scanner.next());
			
			System.out.print("Digite sua idade: ");
			cliente.setIdade(scanner.nextInt());
			
			System.out.print("Digite o seu e-mail: ");
			cliente.setEmail(scanner.next());
			
			System.out.print("Possui conta bancária? (Sim = s / Não = n): ");
			String option = scanner.next();
			
			if (option.toUpperCase().equals("S")) {
				ContaBancaria conta = new ContaBancaria();
				
				System.out.print("\nAgência: ");
				conta.setAgencia(scanner.next());
				
				System.out.print("Número: ");
				conta.setNumero(scanner.next());
				
				System.out.print("Saldo: ");
				conta.setSaldo(scanner.nextDouble());
				
				cliente.setConta(conta);
			} else {
				cliente.setConta(null);
			}
			
			clientes[i] = cliente;
			
			System.out.print("\nCliente cadastrado com sucesso!\n");
		}
		
		System.out.println("\nClientes cadastrado no sistema:");
		
		for (int i = 0; i <= 1; i++) {
			System.out.println(clientes[i].exibirNomeIdade() + "\n" + 
						       clientes[i].exibirDadosConta());
		}

		scanner.close();
	}

}
