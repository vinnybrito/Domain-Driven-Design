package Ex51;

import java.util.Scanner;

public class Ex51_DO_WHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente[] listacliente = new Cliente[5];
		
		int i = 0;
		
		System.out.println("..::Cadastro de Cliente::..");
		
		 do {
			Cliente c = new Cliente();
			
			System.out.print("\nDigite o ID: ");
			c.id = ler.nextInt();
			
			System.out.print("Insira o nome: ");
			c.nome = ler.next();
			
			System.out.print("Digite a idade: ");
			c.idade = ler.nextInt();
			
			System.out.print("Insira o E-mail: ");
			c.email = ler.next();
			
			listacliente[i] = c;
			i++;			
		}while (i <= 4);
		 
		  i = 0;
		 do {
			 if(listacliente[i].idade >= 18) {
				 System.out.println("\nID: " + listacliente[i].id);
				 System.out.println("Nome: " + listacliente[i].nome);
				 System.out.println("Idade: " + listacliente[i].idade);
				 System.out.println("E-mail: " + listacliente[i].email);
			 }
			 i++;
		 }while(i <=4);


	}

}
