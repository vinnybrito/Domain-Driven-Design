package Ex51;

import java.util.Scanner;

public class Ex51_FOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente[] listacliente = new Cliente[3];
		
		System.out.println("..::Cadastro de Clientes::..");
		
		for(int i=0; i <= 2; i++) {
			Cliente c = new Cliente();
			
			System.out.print("\nDigite o ID: ");
			c.id = ler.nextInt();
			
			System.out.print("Digite o nome: ");
			c.nome = ler.next();
			
			System.out.print("Digite o Idade: ");
			c.idade = ler.nextInt();
			
			System.out.print("Digite o E-mail: ");
			c.email = ler.next();
			
			listacliente[i] = c;
		}
		
		System.out.println("\n..::Clientes acima de 18 anos de idade::..");
		
		for(int i=0; i <= 2; i++) {
			if (listacliente[i].idade >= 18) {
				System.out.println("\n------------------------");
				System.out.println("\nID: " + listacliente[i].id);
				System.out.println("Nome: " + listacliente[i].nome);
				System.out.println("Idade: " + listacliente[i].idade);
				System.out.println("E-mail: " + listacliente[i].email);
			}
		}
		

	}

}
