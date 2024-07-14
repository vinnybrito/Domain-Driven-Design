package Checkpoint_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Professor> listaProfessores = new ArrayList<>();
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Coordenador> listaCoordenador = new ArrayList<>();
		
		int opcao;
		String nome = null, ra = null;
		
		do {
			System.out.print("\n<------ CADASTRO ESCOLAR ------>");       
	        System.out.print("\n\nEscolha o tipo de usuário que deseja cadastrar:" +
	        			     "\n 1 - Aluno" +
	                         "\n 2 - Professor" +
	                         "\n 3 - Coordenador" +
	                         "\n 4 - Consultar usuários cadastrados" +
	                         "\n 5 - Sair");
	        System.out.print("\nDigite a opção desejada: ");
			opcao = scanner.nextInt();
			
			if (opcao > 0 && opcao < 4) {
				System.out.print("\nDigite o seu nome: ");
				nome = scanner.next();

				System.out.print("Digite o seu RA: ");
				ra = scanner.next();
			}
			
			if (opcao == 1) {
				Aluno aluno = new Aluno();
				
				aluno.setNome(nome);
				aluno.setRa(ra);
				
				System.out.print("Digite o curso em que está matriculado: ");
				aluno.setCurso(scanner.next());
				
				listaAlunos.add(aluno);
				
				System.out.println("\nO Aluno(a) " + nome + " foi cadastrado com sucesso!");
				System.in.read();
				
			} else if (opcao == 2) {
				Professor professor = new Professor();
				
				professor.setNome(nome);
				professor.setRa(ra);
				
				System.out.print("Número de disciplinas que o professor é responsável: ");
				int quantidade = scanner.nextInt();
				
				String disciplinas[] = new String[quantidade];
				
				for (int i = 0; i < quantidade; i++){
					System.out.print("\nDigite o nome da " + (i + 1) + "° disciplina: ");
					disciplinas[i] = scanner.next();
				}
				
				professor.setDisciplinas(disciplinas);
				
				listaProfessores.add(professor);
				
				System.out.println("\nProfessor(a) " + nome + " cadastrado(a) com sucesso!");
				System.in.read();
				
			} else if (opcao == 3){
				Coordenador coordenador = new Coordenador();
				
				coordenador.setNome(nome);
				coordenador.setRa(ra);
				
				System.out.print("\nNúmero de cursos que o coordenador é responsavel: ");
				int quantidade = scanner.nextInt();
				
				String disciplinas[] = new String[quantidade];
				
				for (int i = 0; i < quantidade; i++) {
					System.out.print("\nDigite o nome do " + (i + 1) + "° curso: ");
					disciplinas[i] = scanner.next();
				}
				
				coordenador.setCursos(disciplinas);
				
				listaCoordenador.add(coordenador);
				
				System.out.println("Coordenador(a) " + nome + " cadastrado(a) com sucesso!");
				System.in.read();
				
			} else if (opcao == 4) {

				if (!listaAlunos.isEmpty() && !listaCoordenador.isEmpty() && !listaProfessores.isEmpty()) {
					System.out.printf("\n<---------- LISTA DE USUÁRIOS ---------->\n\n");
				}
					
				if (!listaCoordenador.isEmpty()) {
					System.out.printf("....::COORDENADORES::....\n\n");
					
					for (Coordenador coordenador : listaCoordenador){
						System.out.println("Nome: " + coordenador.getNome());
						System.out.println("RA: " + coordenador.getRa());
						System.out.printf("\nLISTA DE CURSOS COORDENADOS:\n");
						
						for (int i = 0; i < coordenador.getCursos().length; i++){
							System.out.println((i + 1) + "° - " + coordenador.getCursos()[i]);
						}
					}
					System.out.println();
					System.in.read();
				}
					
				if (!listaProfessores.isEmpty()) {
					System.out.printf("....::PROFESSORES::....\n\n");
					
					for (Professor professor : listaProfessores){
						System.out.println("Nome: " + professor.getNome());
						System.out.println("RA: " + professor.getRa());
						
						System.out.printf("\nLISTA DE DISCIPLINAS MINISTRADAS:\n");
						for (int i = 0; i < professor.getDisciplinas().length; i++){
							System.out.println((i+1)+"° - " + professor.getDisciplinas()[i]);
						}
					}

					System.out.println();
					System.in.read();
				}
					
				if (!listaAlunos.isEmpty()) {
					System.out.printf("....::ALUNOS::....\n\n");
					
					for (Aluno aluno : listaAlunos) {
						System.out.println("Nome: " + aluno.getNome());
						System.out.println("RA: " + aluno.getRa());
						System.out.println("Curso: " + aluno.getCurso());
					}
					System.in.read();
				}
			}
			
		} while(opcao > 0 && opcao < 5);

		scanner.close();
	}

}
