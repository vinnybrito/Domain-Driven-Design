package Ex54;

import java.util.Scanner;

public class Ex54_FOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente[] listaCliente = new Cliente[2];
		
		String resposta;
		
		System.out.println("..:: Cadastro Cliente ::..");
		
		for(int i=0; i <= 1; i++) {
			Cliente c = new Cliente();
			
			System.out.print("\nId: ");
			c.id = ler.nextInt();
			
			System.out.print("Nome: ");
			c.nome = ler.next();
			
			System.out.print("Idade: ");
			c.idade = ler.nextInt();
			
			System.out.print("Email: ");
			c.email = ler.next();
			
			System.out.print("Possui conta Bancaria?: ");
			resposta = ler.next();
			
			if (resposta.equals("s")) {
				ContaBancaria cb = new ContaBancaria();
				
				System.out.print("Agencia: ");
				cb.agencia = ler.next();	
				
				System.out.print("Número: ");
				cb.numero = ler.nextInt();
				
				System.out.print("Conta: ");
				cb.saldo = ler.nextDouble();
				
				c.conta = cb;
			}
			else {
				c.conta = null;
			}
			listaCliente[i] = c;
		}
		
		System.out.println("..:: Cliente ::..");

		for(int i=0; i <= 1; i++) {
			
			System.out.print("\n-----------------");
			System.out.print(listaCliente[i].exibirNomeIdade());
			if (listaCliente[i].conta != null) {
				
				System.out.println("\n..:: Dados da Conta ::..");
				System.out.print(listaCliente[i].exibirDadosConta());
			}
		}
	}

}
