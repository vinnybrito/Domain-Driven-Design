package Ex55;

import java.util.Scanner;

public class Programa_WHILE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[2];
		
		System.out.print("\n<<--- CADASTRO DE CLIENTES --->>\n");
		
		int i = 0;
		
		while (i <= 1) {
			
			Cliente c = new Cliente();
			
			System.out.print("\nID: ");
			c.setId(read.nextInt());
			
			System.out.print("Nome: ");
			c.setNome(read.next());
			
			System.out.print("Idade: ");
			c.setIdade(read.nextInt());
			
			System.out.print("E-mail: ");
			c.setEmail(read.next());
			
			System.out.print("Possui conta bancária? (S/N): ");
			String resposta = read.next();
			
			if (resposta.equalsIgnoreCase("S")) {
				
				ContaBancaria cb = new ContaBancaria();
				
				System.out.print("Agência: ");
				cb.setAgencia(read.next());
				
				System.out.print("Número: ");
				cb.setNumero(read.next());
				
				System.out.print("Saldo: ");
				cb.setSaldo(read.nextDouble());
				
				c.setConta(cb);
				
			}
			
			else {
				c.setConta(null);
			}
			
			listaClientes[i] = c;
			i++;
			
		} 
		
		System.out.print("\n<<--- CLIENTES CADASTRADOS --->>\n");
		
		i = 0;
		
		while (i <= 1) {
			System.out.print(listaClientes[i].exibirNomeIdade());
			
			if (listaClientes[i].getConta() != null) {
				System.out.print(listaClientes[i].exibirDadosConta());
			}
			
			i++;
			
		}

	}

}
