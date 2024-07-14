package Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		
		ArrayList <Cliente> listaClientes = new ArrayList<>();
		
		Cliente client;
		int opcao, id, indexCliente, id_cliente;
		
		do {
			System.out.print("\n<------ CADASTRO DE CLIENTES ------>");       
	        System.out.print("\n\nEscolha uma opção:" +
	        			     "\n 1 - Incluir" +
	                         "\n 2 - Atualizar" +
	                         "\n 3 - Excluir" +
	                         "\n 4 - Exibir" +
	                         "\n 5 - Sair");
	        System.out.print("\nDigite a opção desejada: ");
	        opcao = read.nextInt();
	        
	        if (opcao == 1) {
	        	Cliente cliente = new Cliente();
	        	
	        	if (listaClientes.size() != 0)
	        		id_cliente = listaClientes.get(listaClientes.size() - 1).getId() + 1;
	            else 
	                id_cliente = 1; 
	            
	        	cliente.setId(id_cliente);

	        	System.out.print("Nome: ");
	        	cliente.setNome(read.next());
	        	
	        	System.out.print("Idade: ");
	        	cliente.setIdade(read.nextInt());
	        	
	        	System.out.print("E-mail: ");
	        	cliente.setEmail(read.next());
	        	
	        	System.out.print("Possuí conta bancaria? (S/N): ");
	        	String resposta = read.next();
	        	
	        	cliente.setConta(null);
	        	
	        	if (resposta.equalsIgnoreCase("S")) {
	        		ContaBancaria conta = new ContaBancaria();
	        		
	        		System.out.print("Agência: ");
	        		conta.setAgencia(read.next());
	        		
	        		System.out.print("Número: ");
	        		conta.setNumero(read.next());
	        		
	        		conta.setSaldo(0.0);
	        		
	        		cliente.setConta(conta);
	        	}
	        	
	        	listaClientes.add(cliente);
	        	
	        	System.out.printf("\nCliente incluído com sucesso!");
	            System.in.read();
	            
	        } else if (opcao == 2) {
	        	
	        	for (Cliente cliente: listaClientes) {
	        		System.out.println(cliente.exibirCliente());
	        	}
	        	
	        	System.out.print("Digite o ID do cliente que você deseja atualizar: ");
	            id = read.nextInt();
	            
	            indexCliente = -1;
	            
	            for (Cliente cliente: listaClientes) {
	               if (cliente.getId() == id) {
	                   indexCliente = listaClientes.indexOf(cliente); 
	                   break;
	               }
	            }
	               
               if (indexCliente != -1) {
                   client = listaClientes.get(indexCliente);
                   
                   System.out.print("Digite o seu novo nome: ");
                   client.setNome(read.next());
                   
                   System.out.print("Digite a sua nova idade: ");
                   client.setIdade(read.nextInt());
                   
                   System.out.print("Digite o seu novo e-mail: ");
                   client.setEmail(read.next());
                   
                   System.out.printf("Cliente atualizado com sucesso!");
               } else {
                   System.out.printf("Cliente não encontrado!");
               }
                      
	           System.in.read();
	           
	        } else if (opcao == 3) {
	        	
	        	for (Cliente c: listaClientes) {
	        		System.out.println(c.exibirCliente());
	        	}
	               
	        	System.out.print("Digite o ID do cliente que você deseja excluir: ");
	        	id = read.nextInt();
               
	        	indexCliente = -1;
               
	        	for (Cliente c: listaClientes) {
	        		if (c.getId() == id) {
	        			indexCliente = listaClientes.indexOf(c);
	        			break;
	        		}  
	        	}
               
               if (indexCliente != -1) {                              
                   listaClientes.remove(indexCliente);
                   System.out.printf("Cliente excluído com sucesso!");
               } else {
                   System.out.printf("Cliente não encontrado!");
               }
               
               System.in.read();
               
	        } else if (opcao == 4) {
	        	
	        	for (Cliente cliente: listaClientes) {
	        		System.out.print(cliente.exibirCliente());
	        		
	        		if (cliente.getConta() != null)
	        			System.out.print(cliente.exibirDadosConta());
	        	}
	        	
	        	System.in.read(); 
	        }
			
		} while ((opcao >= 1) && (opcao <= 4));
		
		System.out.print("\nFim do Cadastro!");

		read.close();
	}

}
