package Ex53;

import java.util.Scanner;

public class Ex53_FOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno[] listaAluno = new Aluno[2];
		
		System.out.println("..::Cadastro de Alunos::..");
		
		for(int i=0; i <= 1; i++) {
			Aluno a = new Aluno();
			
			System.out.print("\nRA do aluno: ");
			a.ra = ler.next();
			
			System.out.print("Nome do aluno: ");
			a.nome = ler.next();
			
			String[] listaMateria = new String[6];
			
			for(int b=0; b <= 5; b++) { 
				System.out.print("Inicial de cada matéria: ");
				listaMateria[b] = ler.next();
			}
			
			System.out.print("Período (Noite / Manhã): ");
			a.periodo = ler.next();
			
			listaAluno[i] = a;
		}
		
		System.out.print("\n..::Alunos Período 'Noite'::..");
		
		for(int i=0; i <= 1; i++) {
			if (listaAluno[i].periodo.equals("noite")) {
				System.out.print("\n----------------");
				System.out.print("\nRA: " + listaAluno[i].ra);
				System.out.print("\nNome: " + listaAluno[i].nome);
				System.out.print("\nMatérias: " + listaAluno[i].materias);
				System.out.print("\nPeríodo: " + listaAluno[i].periodo);
			}
		}
		
	}

}
