package Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex57_02 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		
		int opcao, id, indexCliente, id_cliente;
		String resposta;
		Cliente cli;
		
		do {
			System.out.println("..:: Cadastro de Clientes ::..");
			System.out.print("\nEscolha uma opção:");
			System.out.println("\n1- Incluir Cliente \n2- Atualizar Cliente \n3- Excluir Cliente \n4- Exibir Clientes \n5- Sair ");
			
			System.out.print("\nDigite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Cliente c = new Cliente();
				
				if(listaCliente.size() != 0) {
					id_cliente = listaCliente.get(listaCliente.size()-1).getId() + 1;
				}
				else {
					id_cliente = 1;
				}
				
				c.setId(id_cliente);
				
				System.out.print("Nome: ");
				c.setNome(ler.next());
				
				System.out.print("Idade: ");
				c.setIdade(ler.nextInt());
				
				System.out.print("E-mail: ");
				c.setEmail(ler.next());
				
				System.out.print("Possui conta bancária? (S/N): ");
				resposta = ler.next().toUpperCase();
				
				if (resposta.equals("S")) {
					ContaBancaria conta = new ContaBancaria();
					
					System.out.print("Digite a agencia: ");
					conta.setAgencia(ler.next());
					
					System.out.print("Digite o número: ");
					conta.setNumero(ler.next());
					
					conta.setSaldo(0);
					
					c.setConta(conta);
				}
				else {
					c.setConta(null);
				}
				
				listaCliente.add(c);
				
				System.out.printf("\nCliente incluído com sucesso!");
	            System.in.read(); 
			}
			else if (opcao == 2) {
				for (Cliente a: listaCliente) {
					System.out.print(a.exibirCliente());
				}
				
				System.out.print("\nDigite o ID do cliente que você deseja atualizar: ");
				id = ler.nextInt();
				
				indexCliente = -1;
				for (Cliente a: listaCliente) {
					if (a.getId() == id) {
						indexCliente = listaCliente.indexOf(a); 
						break; 
					}
				}
				
				if(indexCliente != -1) {
					cli = listaCliente.get(indexCliente);
					
					System.out.print("Digite o seu novo nome: ");
					cli.setNome(ler.next());
					
					System.out.print("Digite sua nova idade: ");
					cli.setIdade(ler.nextInt());
					
					System.out.print("Digite o seu novo e-mail: ");
					cli.setEmail(ler.next());
					
					System.out.printf("\nCliente atualizado com sucesso!");
		            System.in.read();
				}
				else {
					System.out.printf("\nCliente não encontrado!");
				}
				System.in.read(); 
			}
			else if (opcao == 3) {
				for (Cliente a: listaCliente) {
					System.out.print(a.exibirCliente());
				}
				
				System.out.print("\nDigite o ID do cliente que você deseja excluir: ");
				id = ler.nextInt();
				
				indexCliente = -1;
				for (Cliente a: listaCliente) {
					if (a.getId() == id) {
						indexCliente = listaCliente.indexOf(a); 
						break; 
					}
				}
				if(indexCliente != -1) {
					cli = listaCliente.get(indexCliente);
					
					listaCliente.remove(indexCliente);
					
					System.out.printf("\nCliente excluido com sucesso!");
		            System.in.read();
				}
				else {
					System.out.printf("\nCliente não encontrado!");
				}
				System.in.read(); 
			}
			else if (opcao == 4) {
				for (Cliente a: listaCliente) {
					System.out.print(a.exibirCliente());
					
					if (a.getConta() != null) {
					System.out.print(a.exibirDadosConta());	
					}
				}
				System.in.read(); 
			}					
		}while((opcao >= 1) && (opcao <= 4));
		
	}

}
