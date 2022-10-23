package Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex57_01 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		//Cliente[] listaCliente = new Cliente[3];
		
		int opcao, id, indexCliente;
		Cliente cli;
		
		do {
			System.out.println("..:: Cadastro de Clientes ::..");
			System.out.print("\nEscolha uma opção:");
			System.out.println("\n1- Incluir Cliente \n2- Atualizar Cliente \n3- Excluir Cliente \n4- Exibir Clientes \n5- Sair ");
			
			System.out.print("\nDigite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Cliente c = new Cliente();
				
				System.out.print("ID: ");
				c.setId(ler.nextInt());
				
				System.out.print("Nome: ");
				c.setNome(ler.next());
				
				System.out.print("Idade: ");
				c.setIdade(ler.nextInt());
				
				System.out.print("E-mail: ");
				c.setEmail(ler.next());
				
				listaCliente.add(c); //listaCliente[i] = c;
				
				System.out.printf("\nCliente incluído com sucesso!");
	            System.in.read(); 
			}
			else if (opcao == 2) {
				for (Cliente a: listaCliente) {
					System.out.print(a.exibirCliente());
				}
				
				System.out.print("Digite o ID do cliente que você deseja atualizar: ");
				id = ler.nextInt(); //Variavel id;
				
				indexCliente = -1;
				for (Cliente a: listaCliente) {
					if (a.getId() == id) {//Se o id cadastrado, for igual ao id solicitado na variavel id...
						indexCliente = listaCliente.indexOf(a); //O sistema vai percorrer o array "a"
						break; //Assim que encontrar o id solicitado, pedimos para o sistema dar um break
					}
				}
				
				if(indexCliente != -1) {
					cli = listaCliente.get(indexCliente);
					
					System.out.print("Digite o seu novo nome: ");
					cli.setNome(ler.next());
					
					System.out.print("Digite sua nova idade: ");
					cli.setId(ler.nextInt());
					
					System.out.print("Digite o seu novo e-mail: ");
					cli.setNome(ler.next());
					
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
				
				System.out.print("Digite o ID do cliente que você deseja excluir: ");
				id = ler.nextInt();
				
				indexCliente = -1;
				for (Cliente a: listaCliente) {
					if (a.getId() == id) {
						indexCliente = listaCliente.indexOf(a); 
						break; 
					}
				}
				if (indexCliente != -1) {
					cli = listaCliente.get(indexCliente);
					
					listaCliente.remove(indexCliente);
					
					System.out.printf("\nCliente atualizado com sucesso!");
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
				}
				System.in.read(); 
			}					
		} while((opcao >= 1) && (opcao <= 4));
	}

}
