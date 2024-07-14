package Ex62;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Cliente> clientList = new ArrayList<>();
		
		String agencia, numero;
		int option, clientId, clientIdPix;
		double valor, valorSaldo;
		
		do {
			System.out.println("<========= Banco Macgyver =========>");
			System.out.println("\n ( 1 ) - Criar conta. \n" +
			                   " ( 2 ) - Depósito. \n" +
					           " ( 3 ) - Saque. \n" +
			                   " ( 4 ) - Trânsferencia. \n" +
					           " ( 5 ) - Consulta de Saldo. \n" +
			                   " ( 6 ) - Sair.");
			System.out.print("\nInsira a opção desejada: ");
			option = scanner.nextInt();
			
			if (option == 1) {
				
				System.out.print("\n------------------------------");
				System.out.print("\n<-----CADASTRAR USUÁRIO------>");
				System.out.print("\n------------------------------");
				
				Cliente client = new Cliente();
				
				if (clientList.size() != 0)
					clientId = clientList.get(clientList.size() - 1).getId() + 1;
				else
					clientId = 1;
				
				client.setId(clientId);
				
				System.out.print("\n\nDigite o seu nome: ");
				client.setNome(scanner.next());
				
				System.out.print("Insira a sua idade: ");
				client.setIdade(scanner.nextInt());
				
				ContaBancaria contaBancaria = new ContaBancaria();
				
				if (clientList.size() != 0) {
					int newAgencia = Integer.parseInt(clientList.get(clientList.size() - 1)
							.getConta().getAgencia()) + 1;
					contaBancaria.setAgencia(String.valueOf(newAgencia));
					
					int newNumero = Integer.parseInt(clientList.get(clientList.size() - 1)
							.getConta().getNumero()) + 1;
					contaBancaria.setNumero(String.valueOf(newNumero));
					
				} else {
					contaBancaria.setAgencia("456");
					contaBancaria.setNumero("1200");
				}
				
				contaBancaria.setSaldo(0.0);
				client.setConta(contaBancaria);
				clientList.add(client);
				
				System.out.printf(
						"\n Seja bem-vindo(a), %s.\n - Seu Token ID de acesso é %d.\n", 
						client.getNome(), client.getId()
				);
				System.out.println("\nPressione a tecla Enter para continuar");
				System.out.println("\n------------------------------");
				System.in.read();
			
			} else if (option == 2) {
				
				System.out.print("\n------------------------------");
				System.out.print("\n<-----REALIZAR DEPÓSITO------>");
				System.out.print("\n------------------------------");
				
				System.out.print("\n\nInsira o seu Token ID para realizar o depósito: ");
				clientId = scanner.nextInt();
				
				System.out.print("\nInsira o valor para depósito: ");
				valor = scanner.nextDouble();
				
				for (Cliente client: clientList) {
					if (client.getId() == clientId) {
						client.getConta().setSaldo(valor);
					}
					break;
				}
				
				System.out.println("\nPressione a tecla Enter para continuar");
				System.in.read();
				
			} else if (option == 3) {
				
				System.out.print("\n------------------------------");
				System.out.print("\n<-------REALIZAR SAQUE------->");
				System.out.print("\n------------------------------");
				
				System.out.print("\n\nInsira o seu Token ID para realizar o saque: ");
				clientId = scanner.nextInt();
				
				System.out.print("\nInsira o valor para saque: ");
				valor = scanner.nextDouble();
				
				for (Cliente client: clientList) {
					if (client.getId() == clientId) {
						System.out.println("\nSALDO ANTERIOR: " + client.showBalance());
						client.getConta().sacar(valor);
						System.out.println("SALDO ATUAL: " + client.showBalance());
					}
					break;
				}
				
			} else if (option == 4) {
				
				System.out.print("\n------------------------------");
				System.out.print("\n<---REALIZAR TRASFERENCIA--->");
				System.out.print("\n------------------------------");
				
				System.out.print("\n\nInsira o seu Token ID: ");
				clientId = scanner.nextInt();
				
				System.out.print("\nInsira Token ID do destinatário: ");
				clientIdPix = scanner.nextInt();
				
				System.out.print("\nInforme o valor que deseja Trasferir: ");
				double valorTrasf = scanner.nextDouble();
				
				for (Cliente client: clientList) {
					if (client.getId() == clientId) {
						Cliente cli = clientList.get(clientIdPix - 1);
						client.getConta().trasferir(valorTrasf, cli);		
					}
				}
				
			} else if (option == 5) {
				
				System.out.print("\n------------------------------");
				System.out.print("\n<------CONSULTAR SALDO------->");
				System.out.print("\n------------------------------");
				
				System.out.print("\n\nInsira o seu Token ID para realizar a consulta: ");
				clientId = scanner.nextInt();
				
				for (Cliente client: clientList) {
					if (client.getId() == clientId) {
						client.showClientDetails(client);
					}
				}
				
				System.out.println(
					"\nPressione a tecla Enter para continuar" +
					"\n------------------------------"
				);
				System.in.read();
			}
			
		} while (option >= 1 && option <= 5);
		
		System.out.println("\nAgradeçemos sua presença. Até mais!");

	}

}
