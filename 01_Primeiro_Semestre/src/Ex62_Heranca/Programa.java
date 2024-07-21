package Ex62_Heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	// 34. Vamos fazer um sistema de cadastro de pessoas (apenas inclusão). 
	// O sistema deve ter as opções Pessoa Física e Pessoa Jurídica. Utilize
	// Herança nas classes. Faça o Diagrama de Classe (UML) desse sistema também.
	
	/*Menu:
	1 - Pessoa Física
	2 - Pessoa Jurídica
	3 - Exibir Pessoas
	4 - Sair*/

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		String nome = null, sobrenome = null;
		int opcao, idade = 0;
		
		do {
			System.out.print("\n\n<--------- CADASTRO DE PESSOAS --------->");
			System.out.print("\n\nMENU: " +
							 "\n 1 - Pessoa Física" + 
							 "\n 2 - Pessoa Jurídica" +
							 "\n 3 - Exibir Pessoas" +
							 "\n 4 - Sair");
			System.out.print("\nEscolha uma opção: ");
			opcao = scanner.nextInt();
			
			if (opcao > 0 && opcao < 3) {
				System.out.print("\nNome: ");
				nome = scanner.next();
				
				System.out.print("Sobrenome: ");
				sobrenome = scanner.next();
				
				System.out.print("Idade: ");
				idade = scanner.nextInt();
			}
			
			if (opcao == 1) {
				PessoaFisica pessoaFisica = new PessoaFisica();
				
				pessoaFisica.setNome(nome);
				pessoaFisica.setSobrenome(sobrenome);
				pessoaFisica.setIdade(idade);
				
				System.out.print("CPF: ");
				pessoaFisica.setCPF(scanner.next());
				
				listaPessoas.add(pessoaFisica);
				
				System.out.print("\nPessoa Física cadastrada com sucesso!");
				System.out.print("\nPrecione a tecla Enter para continuar...");
				System.in.read();
			} else if (opcao == 2) {
				PessoaJuridica pessoaJuridica = new PessoaJuridica();
				
				pessoaJuridica.setNome(nome);
				pessoaJuridica.setSobrenome(sobrenome);
				pessoaJuridica.setIdade(idade);
				
				System.out.print("CNPJ: ");
				pessoaJuridica.setCNPJ(scanner.next());
				
				listaPessoas.add(pessoaJuridica);
				
				System.out.print("\nPessoa Física cadastrada com sucesso!");
				System.out.print("\nPrecione a tecla Enter para continuar...");
				System.in.read();
			} else if (opcao == 3) {
				if (!listaPessoas.isEmpty()) {
					for (Pessoa pessoa: listaPessoas) {
						if (pessoa instanceof PessoaFisica) {
							PessoaFisica pf = (PessoaFisica) pessoa;
							System.out.print(pf.mostrarPessoaFisica());
						}
						if (pessoa instanceof PessoaJuridica) {
							PessoaJuridica pj = (PessoaJuridica) pessoa;
							System.out.print(pj.mostrarPessoaJuridica());
						}
					}
				} else {
					System.out.print("Lista de pessoas está vazia!");
				}
				
				System.out.print("\n\nPrecione a tecla Enter para continuar...");
				System.in.read();
			}
			
		} while (opcao > 0 && opcao < 4);
		
		System.out.print("\nFim do Programa!: ");
		
		scanner.close();
	}

}
