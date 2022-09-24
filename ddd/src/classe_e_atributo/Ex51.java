package classe_e_atributo;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente[] listacliente = new Cliente[2];
		
		System.out.println("..::Cadastro de Clientes::..");
		
		for(int i=0; i<=1; i++) {
			Cliente c = new Cliente();
			
			System.out.print("Digite o ID: ");
			c.id = ler.nextInt();
			
			System.out.print("Insira o Nome: ");
			c.name = ler.next();
			
			System.out.print("Digite a idade: ");
			c.idade = ler.nextInt();
			
			System.out.print("Insira o E-mail: ");
			c.email = ler.next();
			
			listacliente[i] = c;
		}
		
		for(int i=0; i<=1; i++) {
			if(listacliente[i].idade >= 18) {
				System.out.println("ID: " + listacliente[i].id);
				System.out.println("Nome: " + listacliente[i].name);
				System.out.println("idade: " + listacliente[i].idade);
				System.out.println("ID: " + listacliente[i].email);
			}
		}

	}

}
