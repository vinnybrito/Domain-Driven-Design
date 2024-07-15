package Ex53_Classes_e_Atributos;

import java.util.Arrays;
import java.util.Scanner;

public class Programa_WHILE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[5];
		
		int i = 0;
		
		while (i <= 4) {
			Aluno aluno = new Aluno();
			
			System.out.print("\nInsira o seu RA: ");
			aluno.ra = scanner.next();
			
			System.out.print("Insira o seu nome: ");
			aluno.nome = scanner.next();
			
			String[] materias = new String[6];
			
			int f = 0;
			
			while (f <= 5) {
				System.out.printf("Insira a inicial da %d matéria: ", f + 1);
				materias[f] = scanner.next();
				f++;
			}
			
			aluno.materias = materias;
			
			System.out.print("Periodo (Noite = n /Manhã = m): ");
			aluno.periodo = scanner.next();
			
			alunos[i] = aluno;
			
			i++;
		}
		
		System.out.print("\nAlunos cadastrados no período Noturno: ");
		
		i = 0;
		
		while (i <= 4) {
			if (alunos[i].periodo.equals("n"))
				System.out.print("\n\nAlunos: " + alunos[i].nome +
						         "\nMatérias: " + Arrays.toString(alunos[i].materias));
			i++;
		}

		scanner.close();
	}

}
