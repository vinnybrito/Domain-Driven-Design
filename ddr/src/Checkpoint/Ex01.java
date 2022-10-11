package Checkpoint;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno[] listaAluno = new Aluno[3];
		
		String resposta;
		
		System.out.println("..:: Cadastro de Alunos ::..");

		for(int i=0; i <= 2; i++) {
			Aluno a = new Aluno();
			
			System.out.print("\nID: ");
			a.setId(ler.nextInt());
			
			System.out.print("RM: ");
			a.setRm(ler.next());
			
			System.out.print("Nome: ");
			a.setNome(ler.next());
			
			System.out.print("Está matriculado? (s/n): ");
			resposta = ler.next();
			
			if(resposta.equals("s")) {
				Curso c = new Curso();
				
				System.out.print("ID do curso: ");
				c.setId(ler.nextInt());
				
				System.out.print("Nome do curso: ");
				c.setNome(ler.next());
				
				a.setCurso(c);
			}
			else {
				a.setCurso(null);
			}
			
			listaAluno[i] = a;
		}
		
		System.out.println("\n..:: Alunos e Cursos ::..");
		
		for(int i=0; i <= 2; i++) {
			System.out.print("\n---------------");
			System.out.print("\nID: " + listaAluno[i].getId());
			System.out.print("\nRM: " + listaAluno[i].getRm());
			System.out.print("\nNome: " + listaAluno[i].getNome());
			
			if(listaAluno[i].getCurso() != null) {
				System.out.print("\n" + listaAluno[i].exibirCurso());
			}
		}
	}

}
