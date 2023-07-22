package Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		
		ArrayList <Cliente> listaClientes = new ArrayList<>();
		
		Cliente cli;
		int opcao, id, indexCliente;
		
		do {
			
			System.out.print("\n<<-- SISTEMA DE CADASTRO DE CLIENTES -->>");
			
			System.out.printf("\n\nEscolha uma opção:\n");          
	        System.out.printf("1 - Incluir \n" +
	                          "2 - Atualizar \n" +
	                          "3 - Excluir \n" +
	                          "4 - Exibir \n" +
	                          "5 - Sair\n\n");


	        System.out.printf("Digite a opção desejada: ");
	        opcao = read.nextInt();
	        
	      //---------------- PRIMEIRA OPÇÃO ----------------//
	        
	        if (opcao == 1) {
	        	
	        	Cliente cliente = new Cliente();
	        	
	        	int id_cliente;
	        	
	        	// Vamos gerar um ID automatico;
	        	
	        	if (listaClientes.size() != 0) // Se a lista não estiver vazia;
	        		id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
	        	
	        	/* A variável "id_Cliente" vai armazenar e pegar (listaCliente.get) 
	        	   alguem da lista;
				   
				 * Assim avisamos para o programa ir até a ultima pessoa cadastrada na
				   lista (lista.Cliente.size());
				   
				 * Para gerar o próximo id, basta avisar que no próximo looping haverá
				   mais um (getId() + 1); */
	        	
	            else 
	                id_cliente = 1; // Se a lista estiver vazia, o id da pessoa será "1";
	            
	        	cliente.setId(id_cliente);

	        	System.out.print("Nome: ");
	        	cliente.setNome(read.next());
	        	
	        	System.out.print("Idade: ");
	        	cliente.setIdade(read.nextInt());
	        	
	        	System.out.print("E-mail: ");
	        	cliente.setEmail(read.next());
	        	
	        	System.out.print("Possuí conta bancaria? (S/N): ");
	        	String resposta = read.next();
	        	
	        	if (resposta.equalsIgnoreCase("S")) {
	        		
	        		ContaBancaria conta = new ContaBancaria();
	        		
	        		System.out.print("Agência: ");
	        		conta.setAgencia(read.next());
	        		
	        		System.out.print("Número: ");
	        		conta.setNumero(read.next());
	        		
	        		conta.setSaldo(0);
	        		
	        		cliente.setConta(conta);
	        	}
	        	
	        	else {
	        		cliente.setConta(null);
	        	}
	        	
	        	listaClientes.add(cliente);
	        	
	        	System.out.printf("\nCliente incluído com sucesso!");
	            System.in.read();
	        }
	        
	      //---------------- SEGUNDA OPÇÃO ----------------//
	        
	        else if (opcao == 2) {
	        	
	        	for (Cliente c: listaClientes) {
	                   System.out.println(c.exibirCliente());
	               }
	        	
	        	System.out.print("Digite o ID do cliente que você deseja atualizar: ");
	            id = read.nextInt();
	            
	            indexCliente = -1;
	            
	               for (Cliente c: listaClientes) {
	                   if (c.getId() == id) {  // Se o id cadastrado, for igual ao id solicitado na variavel id...
	                       indexCliente = listaClientes.indexOf(c); // O sistema vai percorrer o array "c"
	                       break; //Assim que encontrar o id solicitado, pedimos para o sistema dar um break
	                   }
	               }
	               
	               if (indexCliente != -1) {
	                   cli = listaClientes.get(indexCliente);
	                   
	                   System.out.print("Digite o seu novo nome: ");
	                   cli.setNome(read.next());
	                   
	                   System.out.print("Digite a sua nova idade: ");
	                   cli.setIdade(read.nextInt());
	                   
	                   System.out.print("Digite o seu novo e-mail: ");
	                   cli.setEmail(read.next());
	                   
	                   System.out.printf("Cliente atualizado com sucesso!");
	               }
	               
	               else {
	                   System.out.printf("Cliente não encontrado!");
	               }
	                      
		           System.in.read();
	        }
	        
	      //---------------- TERCEIRA OPÇÃO ----------------//
	        
	        else if (opcao == 3) {
	        	
	        	for (Cliente c: listaClientes) {
	                   System.out.println(c.exibirCliente());
	               }
	               
	               System.out.print("Digite o ID do cliente que você deseja excluir: ");
	               id = read.nextInt();
	               
	               indexCliente = -1;
	               
	               for(Cliente c: listaClientes) {
	            	   
	                   if (c.getId() == id) {
	                       indexCliente = listaClientes.indexOf(c);
	                       break;
	                   }  
	               }
	               
	               if (indexCliente != -1) {                              
	                   listaClientes.remove(indexCliente);
	                   System.out.printf("Cliente excluído com sucesso!");
	               }
	               
	               else {
	                   System.out.printf("Cliente não encontrado!");
	               }
	               
	               System.in.read();
	        }
	        
	      //---------------- QUARTA OPÇÃO ----------------//
	        
	        else if (opcao == 4) {
	        	
	        	for (Cliente c: listaClientes) {
	        		System.out.print(c.exibirCliente());
	        		
	        		if (c.getConta() != null) {
	        			System.out.print(c.exibirDadosConta());
		        	}
	        	}
	        	
	        	System.in.read(); 
	        }
			
		} while ((opcao >= 1) && (opcao <= 4));
		
		System.out.print("\nFim do Cadastro!");

	}

}
