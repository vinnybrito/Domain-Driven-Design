package Checkpoint_02;

import java.util.Scanner;

public class Programa {

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
			
			if (resposta.equals ("S")) {
				Curso curso = new Curso();
				
				System.out.print("ID do curso: ");
				curso.setId(scanner.nextInt());
				
				System.out.print("Nome do curso: ");
				curso.setNome(scanner.next());
				
				aluno.setCurso(curso);
			} else {
				aluno.setCurso(null);
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
