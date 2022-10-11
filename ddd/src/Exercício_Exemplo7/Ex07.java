package Exercício_Exemplo7;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa[] listaPessoa = new Pessoa[2];
		
		String resposta;
		
		System.out.println("..:: Cadastro de Pessoas ::..");
		
		for(int i=0; i <= 1; i++) {
			Pessoa p = new Pessoa();
			
			System.out.print("\nId: ");
			p.id = ler.nextInt();
			
			System.out.print("Nome: ");
			p.nome = ler.next();
			
			System.out.print("Possui dependente? S ou N: ");
			resposta = ler.next();
			
			if (resposta.equals("s")) {
				Dependente d = new Dependente();
				
				System.out.print("Nome: ");
				d.nome = ler.next();
				
				System.out.print("Idade: ");
				d.idade = ler.nextInt();
				
				p.dep = d;
			}
			
			else {
				p.dep = null;
			}
			
			listaPessoa[i] = p;
		}
		
		System.out.println("..:: Cadastro de Pessoas ::..");
		
		for(int i=0; i <= 1; i++) {
			System.out.println(listaPessoa[i].exibirIdNome());
			if (listaPessoa[i].dep != null ) {
				System.out.println(listaPessoa[i].exibirDependente());
			}
		}

	}

}
