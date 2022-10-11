package Ex55;

import java.util.Scanner;

public class Ex55_FOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente[] listaCliente = new Cliente[2];
		
		String resposta;

		System.out.println("..:: Cadastro Cliente ::..");
		
		for(int i=0; i<=1; i++) {
			Cliente c = new Cliente();
			
			System.out.print("\nID: ");
			c.setId(ler.nextInt());
			
			System.out.print("Nome: ");
			c.setNome(ler.next());
			
			System.out.print("Idade: ");
			c.setIdade(ler.nextInt());
			
			System.out.print("E-mail: ");
			c.setEmail(ler.next());
			
			System.out.print("Possui conta bancária?: ");
			resposta = ler.next();
			
			if (resposta.equals("s")) {
				ContaBancaria cb = new ContaBancaria();
				
				System.out.print("Agencia: ");
				cb.setAgencia(ler.next());
				
				System.out.print("Número: ");
				cb.setNumero(ler.next());
				
				System.out.print("Saldo: ");
				cb.setSaldo(ler.nextDouble());
				
				c.setConta(cb);
			}
			else {
				c.setConta(null);
			}
			listaCliente[i] = c;
		}
		
		System.out.println("..:: Cliente ::..");
		
		for(int i=0; i<=1; i++) {
			System.out.println("\n--------------------");
			System.out.println(listaCliente[i].exibirNomeIdade());
			if (listaCliente[i].getConta() != null) {
				System.out.println(listaCliente[i].exibirDadosConta());
			}
		}
	}

}
