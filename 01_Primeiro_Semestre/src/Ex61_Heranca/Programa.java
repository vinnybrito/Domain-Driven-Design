package Ex61_Heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	// 33. Vamos fazer um sistema de cadastro de contas (apenas inclusão). 
	// O sistema deve ter as opções Conta Corrente, Conta Poupança e Conta
	// Salário. Utilize Herança nas classes. Faça o Diagrama de Classe (UML) 
	// desse sistema também.
	/*
	Menu:
	1 - Conta Corrente
	2 - Conta Poupança
	3 - Conta Salário
	4 - Exibir Contas
	5 - Sair*/

	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Conta> listaConta = new ArrayList<>();
		
		int opcao;
		String agencia = null, numero = null;
		
		do {
			System.out.print("\n\n<--------- CADASTRO DE CONTAS --------->");
			System.out.print("\n\nMENU: " +
							 "\n 1 - Conta Corrente" + 
							 "\n 2 - Conta Poupança" +
							 "\n 3 - Conta Salário" +
							 "\n 4 - Exibir Contas" +
							 "\n 5 - Sair");
			System.out.print("\nEscolha uma opção: ");
			opcao = scanner.nextInt();
			
			if (opcao > 0 && opcao < 4) {	
				System.out.print("\nAgência: ");
				agencia = scanner.next();
				
				System.out.print("Número: ");
				numero = scanner.next();
			}
			
			if (opcao == 1) {
				ContaCorrente contaCorrente = new ContaCorrente();
				
				contaCorrente.setAgencia(agencia);
				contaCorrente.setNumero(numero);
				
				System.out.print("Digite o valor do cheque especial: ");
				contaCorrente.setCheckEspecial(scanner.nextDouble());
				
				listaConta.add(contaCorrente);
				
				System.out.print("\nConta corrente cadastrada com sucesso!");
				System.out.print("\nPrecione a tecla Enter para continuar...");
				System.in.read();
				
			} else if (opcao == 2) {
				ContaPoupanca contaPoupanca = new ContaPoupanca();
				
				contaPoupanca.setAgencia(agencia);
				contaPoupanca.setNumero(numero);
				
				System.out.print("Digite a Rentabilidade: ");
				contaPoupanca.setRentabilidade(scanner.nextDouble());
				
				listaConta.add(contaPoupanca);
				
				System.out.print("\nConta poupança cadastrada com sucesso!");
				System.out.print("\nPrecione a tecla Enter para continuar...");
				System.in.read();
				
			} else if (opcao == 3) {
				ContaSalario contaSalario = new ContaSalario();
				
				contaSalario.setAgencia(agencia);
				contaSalario.setNumero(numero);
				
				listaConta.add(contaSalario);
				
				System.out.print("\nConta salário cadastrada com sucesso!");
				System.out.print("\nPrecione a tecla Enter para continuar...");
				System.in.read();
				
			} else if (opcao == 4) {
				
				if (!listaConta.isEmpty()) {
					for (Conta conta: listaConta) {
						if (conta instanceof ContaCorrente) {
							ContaCorrente cc = (ContaCorrente) conta;
							System.out.print(cc.mostrarContaCorrente());
						}
						
						if (conta instanceof ContaPoupanca) {
							ContaPoupanca cp = (ContaPoupanca) conta;
							System.out.print("\n" + cp.mostrarContaPoupanca());
						}
						
						if (conta instanceof ContaSalario) {
							ContaSalario cs = (ContaSalario) conta;
							System.out.print("\n" + cs.mostrarContaSalario());
						}
					}
				}
				
				System.out.print("\n\nPrecione a tecla Enter para continuar...");
				System.in.read();
			}
			
		} while (opcao > 0 && opcao <= 5);
		
		scanner.close();
	}

}
