package Ex58;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("..:: Cadastro de Produtos ::..");
			System.out.println("\nEscolha uma opção:");
			System.out.println("1- Incluir Produto" +
							   "\n2- Atualizar Produto" +
							   "\n3- Excluir Produto" +
							   "\n4- Exibir Produto" +
							   "\n5- Sair");
			
			System.out.println("\nDigite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				
			}
			
		} while((opcao >=1) && (opcao <= 4));

	}

}
