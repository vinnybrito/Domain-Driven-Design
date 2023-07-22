package Ex51;

import java.util.Scanner;

public class Programa_WHILE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[5];
		
		int i = 0;
		
		System.out.print("<<--- CADASTRO DE CLIENTES --->>\n");
		
		while (i <= 4) {
			
			Cliente c = new Cliente();
			
			System.out.print("\nID: ");
			c.id = read.nextInt();
			
			System.out.print("Nome: ");
			c.nome = read.next();
			
			System.out.print("Idade: ");
			c.idade = read.nextInt();
			
			System.out.print("E-mail: ");
			c.email = read.next();
			
			listaClientes[i] = c;
			i++;
			
		}
		
		System.out.print("\n<<--- CLIENTES ACIMA DE 18 ANOS --->>\n");
		
		i = 0;
		
		while (i <= 4) {
			
			if (listaClientes[i].idade >= 18) {
				System.out.println("\nID: " + listaClientes[i].id);
				System.out.println("Nome: " + listaClientes[i].nome);
				System.out.println("Idade: " + listaClientes[i].idade);
				System.out.println("E-mail: " + listaClientes[i].email);
			}
			
			i++;
		}

	}

}
