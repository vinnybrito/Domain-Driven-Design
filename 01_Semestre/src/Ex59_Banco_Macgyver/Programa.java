package Ex59_Banco_Macgyver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		Cliente cli, cli_origem, cli_destino;
		double valor;
		int opcao, id, id_Cliente, indexCliente, id_cliente_origem, indexClienteOrigem, id_cliente_destino, indexClienteDestino;
		
		do {
			System.out.print("\n\n<<---- Banco Macgyver ---->>");          
	        System.out.printf("\n\nEscolha uma opção:\n" +
	        				  " 1 - Criar cliente/conta \n" +
	                          " 2 - Depósito \n" +
	                          " 3 - Saque \n" +
	                          " 4 - Tranferência \n" +
	                          " 5 - Consulta de Saldo\n" +
	                          " 6 - Sair\n\n");
	        System.out.printf("Digite a opção desejada: ");
	        opcao = read.nextInt();
	        
	        if (opcao == 1) {
	        	Cliente cliente = new Cliente();
	        	
	        	if (listaClientes.size() != 0)
	        		id_Cliente = listaClientes.get(listaClientes.size() - 1).getId() + 1;
	        	else 
	        		id_Cliente = 1;
	        	
	        	cliente.setId(id_Cliente);
	        	
	        	System.out.print("Nome: ");
	        	cliente.setNome(read.next());
	        	
	        	System.out.print("idade: ");
	        	cliente.setIdade(read.nextInt());
	        	
	        	ContaBancaria conta = new ContaBancaria();
	        	
	        	System.out.print("Agência: ");
	        	conta.setAgencia(read.next());
	        	
	        	System.out.print("Número: ");
	        	conta.setNumero(read.next());
	        	
	        	conta.setSaldo(0.0);
	        	
	        	cliente.setConta(conta);
	        	
	        	listaClientes.add(cliente);
	        	
	        	System.out.print("\nCliente Cadastrado com Sucesso!");
	        	System.in.read();
	       	
	        } else if (opcao == 2) {
	        	
        		System.out.print("\n<<-- Clientes Cadastrados -->>\n");
	        	
	        	for (Cliente c: listaClientes) {
	        		System.out.print(c.exibirCliente());
	        	}
	               
             	if (listaClientes.size() == 0) {
                   System.out.print("Não existem clientes cadastrados!");
                   System.in.read();
                   continue;
                }
               
               System.out.print("\n\nDigite o ID do cliente que você deseja "
               		          + "realizar um depósito: ");
               id = read.nextInt();
               
               indexCliente = -1;
               
               for(Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Digite o valor do depósito: ");
                   valor = read.nextDouble();
                   
                   	while(valor < 0) {
                       	System.out.print("Erro, valor negativo! Digite um novo valor: ");
                       	valor = read.nextDouble();
                   	}
                   
                   	cli.getConta().Depositar(valor);
                   
                   System.out.printf("Depósito realizado com sucesso!");
               	} else {
               		System.out.printf("Cliente não encontrado!");
               	}
               
               	System.in.read();

	        } else if (opcao == 3) {
	        	
	        	System.out.print("\n<<-- Clientes Cadastrados -->>\n");
	        	
	        	for (Cliente c: listaClientes) {
	        		System.out.print(c.exibirCliente());
	        	}
	        	
	        	System.out.print("\n\nDigite o ID do cliente que você deseja"
	        			       + " realizar um saque: ");
	        	id = read.nextInt();
               
	        	indexCliente = -1;
	        	for(Cliente c: listaClientes) {
	        		if (c.getId() == id) {
	        			indexCliente = listaClientes.indexOf(c);
	        			break;
	        		}
	        	}
               
	        	if (indexCliente != -1) {
	        		cli = listaClientes.get(indexCliente);
                   
	        		System.out.print("Digite o valor do saque: ");
	        		valor = read.nextDouble();
                   
	        		while (valor < 0) {
	        			System.out.print("Erro, valor negativo! Digite um novo valor: ");
	        			valor = read.nextDouble();
	        		}
               
	        		if (cli.getConta().Sacar(valor))
                       System.out.printf("Saque realizado com sucesso!");                      
	        		else
                       System.out.printf("Saldo insuficiente para saque!");
	        	} else {
	        		System.out.printf("Cliente não encontrado!");
	        	}
	        	
	        	System.in.read();

	        } else if (opcao == 4) {
	        	
	        	System.out.print("\n<<-- Clientes Cadastrados -->>\n");
	        	for (Cliente c: listaClientes) {
	        		System.out.print(c.exibirCliente());
	        	}
	        	
	        	System.out.print("Digite o ID do cliente de origem da transferência: ");
	        	id_cliente_origem = read.nextInt();
               
	        	indexClienteOrigem = -1;
	        	
	        	for(Cliente c: listaClientes) {
	        		if (c.getId() == id_cliente_origem) {
	        			indexClienteOrigem = listaClientes.indexOf(c);
	        			break;
	        		}
	        	}
               
	        	System.out.print("Digite o ID do cliente de destino da transferência: ");
	        	id_cliente_destino = read.nextInt();
               
	        	indexClienteDestino = -1;
	        	
	        	for(Cliente c: listaClientes) {
	        		if (c.getId() == id_cliente_destino) {
	        			indexClienteDestino = listaClientes.indexOf(c);
	        			break;
	        		}
	        	}
               
	        	if ((indexClienteOrigem != -1) && (indexClienteDestino != -1)) {
	        		cli_origem = listaClientes.get(indexClienteOrigem);
	        		cli_destino = listaClientes.get(indexClienteDestino);
                   
	        		if (cli_origem == cli_destino) {
	        			System.out.print("Erro! O cliente de origem é o mesmo de destino!");
	        		} else {
	        			System.out.print("Digite o valor da transfer�ncia: ");
	        			valor = read.nextDouble();
                       
	        			while(valor < 0) {
	        				System.out.print("Erro, valor negativo! Digite um novo valor: ");
	        				valor = read.nextDouble();
	        			}
                       
	        			if (cli_origem.getConta().getSaldo() >= valor) {
	        				cli_origem.getConta().Transferir(valor, cli_destino);
	        				System.out.printf("Transfer�ncia realizada com sucesso!");                      
	        			} else {
	        				System.out.printf("Saldo insuficiente para transferência!");
	        			}
	        		}
	        	} else {
	        		System.out.printf("Cliente origem ou cliente destino não encontrado!");
	        	}
	        	
               System.in.read();
               
	        } else if (opcao == 5) {
	        	
	        	for (Cliente c: listaClientes) {
	        		System.out.print("\n<<-- Clientes Cadastrados -->>\n");
	        		System.out.print(c.exibirCliente());
	        	}
	        	
	        	System.out.print("Digite o ID do cliente que você deseja obter o saldo: ");
	        	id = read.nextInt();
               
	        	indexCliente = -1;
	        	
	        	for(Cliente c: listaClientes) {
	        		if (c.getId() == id) {
	        			indexCliente = listaClientes.indexOf(c);
	        			break;
	        		}
	        	}
               
	        	if (indexCliente != -1) {
	        		cli = listaClientes.get(indexCliente);
	        		System.out.print("Saldo: R$ " + cli.getConta().ConsultarSaldo());
	        	} else {
	        		System.out.printf("Cliente não encontrado!");
	        	}
	        	
	        	System.in.read();
	        }
					
		} while ((opcao >= 1) && (opcao <= 5));
		
		System.out.print("Sessão encerrada. Volte sempre!");

	}

}
