package Ex51;

import java.util.Scanner;

public class Programa_FOR {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);	
		
		Cliente [] listaClientes = new Cliente[5];
		
		System.out.print("<<--- CADASTRO DE CLIENTES --->>\n");
		
		for (int i = 0; i <= 4; i++) {
			
			Cliente c = new Cliente();
			
			System.out.print("\nDigite o ID do cliente: ");
			c.id = read.nextInt();
			
			System.out.print("Digite o nome: ");
			c.nome = read.next();
			
			System.out.print("Digite a idade: ");
			c.idade = read.nextInt();
			
			System.out.print("Digite o email: ");
			c.email = read.next();
			
			listaClientes[i] = c;
			
		}
		
		System.out.print("\n<<--- CLIENTES ACIMA DE 18 ANOS --->>\n");
		
		for (int i = 0; i <= 4; i++) {
			
			if (listaClientes[i].idade >= 18) {
				
				System.out.println("\nID: " + listaClientes[i].id);
				System.out.println("Nome: " + listaClientes[i].nome);
				System.out.println("Idade: " + listaClientes[i].idade);
				System.out.println("E-mail: " + listaClientes[i].email);
				
			}
		}			

	}

}
