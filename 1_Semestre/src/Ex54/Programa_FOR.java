package Ex54;

import java.util.Scanner;

public class Programa_FOR {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[5];
		
		System.out.print("\n<<--- CADASTRO DE CLIENTES --->>\n");
		
		for (int i = 0; i <= 4; i++) {
			Cliente c = new Cliente();
			
			System.out.print("\nID: ");
			c.id = read.nextInt();
			
			System.out.print("Nome: ");
			c.nome = read.next();
			
			System.out.print("Idade: ");
			c.idade = read.nextInt();
			
			System.out.print("E-mail: ");
			c.email = read.next();
			
			System.out.print("\nPossui conta báncaria? (S/N): ");
			String resposta = read.next();
			
			if (resposta.equalsIgnoreCase("S")) {
				
				ContaBancaria cb = new ContaBancaria();
				
				System.out.print("Agência: ");
				cb.agencia = read.next();
				
				System.out.print("Número: ");
				cb.numero = read.next();
				
				System.out.print("Saldo: ");
				cb.saldo = read.nextDouble();
				
				c.conta = cb;	
			}
			
			else {
				c.conta = null;
			}
			
			listaClientes[i] = c;
		}

		System.out.print("\n<<--- CLIENTES CADASTRADOS --->>\n");
		
		for (int i = 0; i <= 4; i++) {
			
			System.out.print(listaClientes[i].exibirNomeIdade());
			
			if (listaClientes[i].conta != null) {
				System.out.print(listaClientes[i].exibirDadosConta());
			}
		}

	}

}
