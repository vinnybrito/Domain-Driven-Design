package Ex53;

import java.util.Scanner;

public class Ex53_WHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno[] listaAluno = new Aluno[3];
		
		System.out.println("..:: Cadastro de Alunos ::..");
		
		for(int i=0; i <=2; i++) {
			Aluno a = new Aluno();
			
			System.out.print("\nDigite o RA: ");
			a.ra = ler.next();
			
			System.out.print("Nome do Aluno: ");
			a.nome = ler.next();
			
			String[] listaMaterias = new String[6];
			
			for(int b=0; b <=5; b++) {
				System.out.print("Digite as iniciais de cada matéria: ");
				listaMaterias[b] = ler.next();
			}
			
			System.out.print("Período: ");
			a.periodo = ler.next();
			
			listaAluno[i] = a;
		}
		
		System.out.println("\n..:: Alunos do período noturno ::..");
		
		for(int i=0; i <=2; i++) {
			if (listaAluno[i].periodo.equals("noite")) {
				System.out.print("\n----------------");
				System.out.printf("RA: s%\nNome: s%\nMaterias: s%\nPeríodo: s%", listaAluno[i].ra, listaAluno[i].nome, listaAluno[i].materias, listaAluno[i].periodo);
			}
		}

	}

}
