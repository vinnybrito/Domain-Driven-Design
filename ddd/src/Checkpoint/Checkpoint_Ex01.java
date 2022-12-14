package Checkpoint;

import java.util.Scanner;

public class Checkpoint_Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno[] listaAluno = new Aluno[3];
		
		String resposta;
		
		System.out.println("..:: Cadastro de Aluno ::..");
		
		for(int i=0; i<=2; i++) {
			Aluno a = new Aluno();
			
			System.out.print("\nDigite o ID: ");
			a.setId(ler.nextInt());
			
			System.out.print("Digite o RM: ");
			a.setRm(ler.next());
			
			System.out.print("Digite o Nome: ");
			a.setNome(ler.next());
			
			System.out.print("O aluno está matriculado? (S/N): ");
			resposta = ler.next().toUpperCase();
			
			if(resposta.equals ("S")) {
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
		
		System.out.println("\n..:: Exibir Alunos ::..");
		
		for(int i=0; i<=2; i++) {
			
			System.out.print("------------------");
			System.out.println(listaAluno[i].exibirDadosAluno());
			
			if(listaAluno[i].getCurso() != null) {
				System.out.println(listaAluno[i].exibirCurso());
			}
		}
	}

}