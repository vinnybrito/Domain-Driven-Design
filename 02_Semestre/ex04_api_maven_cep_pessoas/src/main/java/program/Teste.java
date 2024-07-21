package program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pessoa;
import service.EnderecoService;

public class Teste {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		EnderecoService enderecoservice = new EnderecoService();
		ArrayList<Pessoa> pessoaList = new ArrayList<>();
		
		String cep;
		int option, pessoaId;
		
		try {
			
			do { 
				
				System.out.println("\n<========= Cadastro de Pessoas =========>");
				System.out.println(" ( 1 ) - Incluir. \n" +
				                   " ( 2 ) - Alterar. \n" +
						           " ( 3 ) - Excluir. \n" +
				                   " ( 4 ) - Consultar Pessoas.");
				System.out.print("Digite a opção desejada: ");
				option = scanner.nextInt();
				
				if (option == 1) {
					
					Pessoa pessoa = new Pessoa();
					
					System.out.print("Digite o seu CEP: ");
					cep = scanner.next();
					pessoa = enderecoservice.getEndereco(cep);
					
					if (pessoaList.size() != 0)
						pessoaId = pessoaList.get(pessoaList.size() - 1).getId() + 1;
					else
						pessoaId = 1;
					
					pessoa.setId(pessoaId);
					
					System.out.print("\nDigite o seu nome: ");
					pessoa.setNome(scanner.next());
					
					System.out.print("Digite o seu e-mail: ");
					pessoa.setEmail(scanner.next());
					
					System.out.print("Digite o seu numero da casa: ");
					pessoa.setNumeroCasa(scanner.next());
					
					System.out.print("Digite o complemento: ");
					pessoa.setComplemento(scanner.next());
					
					pessoaList.add(pessoa);
					
					System.out.println("\nPessoa registrada com sucesso!");
					System.out.print("\nPrecione a tecla Enter para continuar...");
					System.in.read();
					
				} else if (option == 2) {
					
				} else if (option == 3) {
					
					System.out.print("\nDigite o ID da Pessoa que deseja excluir: ");
					pessoaId = scanner.nextInt();
					
					pessoaList.remove(pessoaId - 1);
					
					System.out.println("\nPessoa Removida com sucesso");
					System.out.println("\nPrecione a tecla Enter para continuar...");
					System.in.read();
					
				} else if (option == 4) {
					
					System.out.print("\nDigite o ID da Pessoa que deseja consultar: ");
					pessoaId = scanner.nextInt();
					
					System.out.println("\n-------------------------");
					
					for (Pessoa pessoa: pessoaList) {
						if (pessoa.getId() == pessoaId) {
							pessoa.exibirDadosPessoa(pessoa);
						}
						break;
					}
					
					System.out.println("\n-------------------------");
					System.out.println("\nPrecione a tecla Enter para continuar...");
					System.in.read();
					
				} else {
					System.out.print("Opção inválida");
				}
				
			} while (option > 0 && option < 4);
			
		} catch (IOException e) {
			 e.printStackTrace();
		} 
		
	}

}
