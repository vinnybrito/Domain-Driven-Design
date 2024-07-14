package Checkpoint_02;

import java.util.Scanner;

public class Programa {
	
	// CP2 - Crie as classes conforme o Diagrama de Classe (UML) abaixo. 
	// Crie Getters e Setters para todos os atributos das classes. 
	// Crie um programa que utilize essas classes para cadastrar 5
	// alunos em uma lista de alunos e pergunte para cada aluno se 
	// ele está ou não matriculado em um curso. Caso o aluno esteja 
	// matriculado, permita ele cadastrar os dados do curso. Ao final,
	// exibir todos os alunos e seu respectivo curso, se houver.


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Aluno[] listaAluno = new Aluno[3];
		
		System.out.println("..:: Cadastro de Aluno ::..");
		
		for (int i = 0; i <= 2; i++) {
			Aluno aluno = new Aluno();
			
			System.out.print("\nInsira o seu ID: ");
			aluno.setId(scanner.nextInt());
			
			System.out.print("Insira o seu RM: ");
			aluno.setRm(scanner.next());
			
			System.out.print("Digite seu Nome: ");
			aluno.setNome(scanner.next());
			
			System.out.print("O aluno está matriculado? (S/N): ");
			String resposta = scanner.next().toUpperCase();
			
			aluno.setCurso(null);
			
			if (resposta.equals ("S")) {
				Curso curso = new Curso();
				
				System.out.print("ID do curso: ");
				curso.setId(scanner.nextInt());
				
				System.out.print("Nome do curso: ");
				curso.setNome(scanner.next());
				
				aluno.setCurso(curso);
			}
			
			listaAluno[i] = aluno;	
		}
		
		System.out.println("\n..:: Exibir Alunos ::..");
		
		for (int i = 0; i <= 2; i++) {
			System.out.print("------------------");
			System.out.println(listaAluno[i].exibirDadosAluno());
			
			if (listaAluno[i].getCurso() != null)
				System.out.println(listaAluno[i].exibirCurso());
		}

		scanner.close();
	}

}
