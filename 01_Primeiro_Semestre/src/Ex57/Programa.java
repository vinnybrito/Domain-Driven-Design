package Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList <Cliente> listaClientes = new ArrayList<>();
		Cliente cli;
		int option, id, indexCliente, id_cliente;
		
		do {
			showMenu();
	        option = scanner.nextInt();
	        
	        if (option == 1) {	
	        	clientRegister(listaClientes, scanner);
	        } else if (option == 2) {
	        
	        	System.out.print("\nClientes cadastrados:\n");
	        	System.out.print(Cliente.exibirListaClientes(listaClientes));

	        	
	        	System.out.print("\nDigite o ID do cliente que você deseja atualizar: ");
	            id = scanner.nextInt();
	            
	            indexCliente = -1;
	            
	            /*for (Cliente cliente: listaClientes) {
	            	if (cliente.getId() == id) {  
	            		indexCliente = listaClientes.indexOf(cliente);
	                    break;
	                }
	            }*/
	               
	               if (indexCliente != -1) {
	                   cli = listaClientes.get(indexCliente);
	                   
	                   System.out.print("Digite o seu novo nome: ");
	                   cli.setNome(scanner.next());
	                   
	                   System.out.print("Digite a sua nova idade: ");
	                   cli.setIdade(scanner.nextInt());
	                   
	                   System.out.print("Digite o seu novo e-mail: ");
	                   cli.setEmail(scanner.next());
	                   
	                   System.out.printf("Cliente atualizado com sucesso!");
	               }
	               
	               else {
	                   System.out.printf("Cliente não encontrado!");
	               }
	                      
		           System.in.read();
	        } else if (option == 3) {
	     
	        	System.out.print("\nClientes cadastrados:\n");
	        	System.out.print(Cliente.exibirListaClientes(listaClientes));
	        	
	        	/*for (Cliente cliente: listaClientes) {
	                   System.out.println(cliente.exibirCliente());
	        	}*/
	               
	        	System.out.print("Digite o ID do cliente que você deseja excluir: ");
	            id = scanner.nextInt();
	               
	            indexCliente = -1;
	               
	            /*for (Cliente cliente: listaClientes) {
	            	if (cliente.getId() == id) {
	            		indexCliente = listaClientes.indexOf(cliente);
	            		break;
	            	}  
	            }*/
	               
	               if (indexCliente != -1) {                              
	                   listaClientes.remove(indexCliente);
	                   System.out.printf("Cliente excluído com sucesso!");
	               } else {
	                   System.out.printf("Cliente não encontrado!");
	               }
	               
	               System.in.read();
	        } else if (option == 4) {
	        	
	        	System.out.print("\nCLIENTES CADASTRADOS:\n");
	        	System.out.print(Cliente.exibirListaClientes(listaClientes));
	        	
	        	showProceedMessage();
	        	
	        } else if (option == 5) {
	        	System.out.print("\nVocê escolheu sair...\nDeseja mesmo sair? (Sim = 1 / Não = 2)\nResposta: ");
	        	int exit = scanner.nextInt();
	        	
	        	if (exit == 1) 
	        		option = 6;
	        	
	        	showProceedMessage();
	        }
			
		} while ((option >= 1) && (option <= 5));
		
		System.out.print("\nAté a proxima!");

		scanner.close();
	}
	
	private static void showMenu() throws IOException {
		System.out.print("\n<------ CADASTRO DE CLIENTES ------>");       
        System.out.print("\n\nEscolha uma opção:" +
        			     "\n 1 - Incluir" +
                         "\n 2 - Atualizar" +
                         "\n 3 - Excluir" +
                         "\n 4 - Exibir" +
                         "\n 5 - Sair");
        System.out.print("\nDigite a opção desejada: ");
	}
	
	private static void clientRegister(ArrayList<Cliente> listaClientes, Scanner scanner) throws IOException {
		Cliente cliente = new Cliente();
    	
    	cliente.setId(cliente.gerarId(listaClientes));

    	System.out.print("Nome: ");
    	cliente.setNome(scanner.next());
    	
    	System.out.print("Idade: ");
    	cliente.setIdade(scanner.nextInt());
    	
    	System.out.print("E-mail: ");
    	cliente.setEmail(scanner.next());
    	
    	System.out.print("Possuí conta bancaria? (S/N): ");
    	String answer = scanner.next();
    	
    	cliente.setConta(null);
    	
    	if (answer.equalsIgnoreCase("S")) {	
    		ContaBancaria conta = new ContaBancaria();
    		
    		System.out.print("Agência: ");
    		conta.setAgencia(scanner.next());
    		
    		System.out.print("Número: ");
    		conta.setNumero(scanner.next());
    		
    		conta.setSaldo(0.0);
    		
    		cliente.setConta(conta);
    	}
    	
    	listaClientes.add(cliente);
    	
    	showProceedMessage();
	}
	
    private static void showProceedMessage() throws IOException {
        System.out.printf("\nAperte a tecla ENTER para prosseguir...");
        System.in.read();
    }

}
