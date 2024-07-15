package Ex53_Classes_e_Atributos;

import java.util.Arrays;
import java.util.Scanner;

public class Programa_FOR {
	
	// 53. Crie uma classe conforme o Diagrama de Classe (UML).
	// Crie um programa que utilize essa classe para cadastrar
	// 5 alunos em uma lista de alunos. Durante o cadastro do aluno,
	// solicitar para o aluno cadastrar a sigla/iniciais das 6 matérias
	// que ela está cursando no momento. Ao final exibir apenas os
	// alunos do período “noite”.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[5];
		
		for (int i = 0; i <= 4; i++) {
			Aluno aluno = new Aluno();
			
			System.out.print("\nInsira o seu RA: ");
			aluno.ra = scanner.next();
			
			System.out.print("Insira o seu nome: ");
			aluno.nome = scanner.next();
			
			String[] materias = new String[6];
			
			for (int f = 0; f <= 5; f++) {
				System.out.printf("Insira a inicial da %d matéria: ", f + 1);
				materias[f] = scanner.next();
			}
			
			aluno.materias = materias;
			
			System.out.print("Periodo (Noite = n /Manhã = m): ");
			aluno.periodo = scanner.next();
			
			alunos[i] = aluno;
		}
		
		System.out.print("\nAlunos cadastrados no período Noturno: ");
		
		for (int i = 0; i <= 4; i++) {
			if (alunos[i].periodo.equals("n"))
				System.out.print("\n\nAlunos: " + alunos[i].nome +
						         "\nMatérias: " + Arrays.toString(alunos[i].materias));
		}

		scanner.close();
	}

}
