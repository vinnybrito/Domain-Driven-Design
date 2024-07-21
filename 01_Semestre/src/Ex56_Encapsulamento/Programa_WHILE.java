package Ex56_Encapsulamento;

import java.util.Scanner;

public class Programa_WHILE {
	
	// 56. Crie as classes conforme o Diagrama de Classe (UML) abaixo. Crie Getters e Setters
	// para todos os atributos das classes. Crie um programa que utilize essas classes para
	// cadastrar 5 produtos em uma lista de produtos e pergunte para cada produto se ele tem ou
	// não uma categoria. Caso o produto tenha, permita ele cadastrar os dados da categoria. Ao
	// final, exibir todos os produtos e suas respectivas categorias, se houver.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Produto[] produtos = new Produto[5];
		
		int i = 0;
		
		while (i <= 4) {
			Produto produto = new Produto();
			
			System.out.print("\nID: ");
			produto.setId(scanner.nextInt());
			
			System.out.print("Nome: ");
			produto.setNome(scanner.next());
			
			System.out.print("Preço: ");
			produto.setPreco(scanner.nextDouble());
			
			System.out.print("Quantidade: ");
			produto.setQuantidade(scanner.nextDouble());
			
			System.out.print("\nProduto possuí categoria? (Sim = s / Não = n): ");
			String resposta = scanner.next();
			
			if (resposta.toUpperCase().equals("S")) {
				Categoria categoria = new Categoria();
				
				System.out.print("\nID categoria: ");
				categoria.setId(scanner.nextInt());
				
				System.out.print("Nome categoria: ");
				categoria.setNome(scanner.next());
				
				produto.setCategoria(categoria);
			} else {
				produto.setCategoria(null);
			}
			
			produtos[i] = produto;
			
			System.out.print("\nProdutos cadastrado com sucesso!");
			i++;
		}
		
		System.out.print("\n\nProdutos cadastradas:");
		
		i = 0;
		
		while (i <= 4) {
			System.out.print(produtos[i].exibirNomePreco());
			
			if (produtos[i].getCategoria() != null)
				System.out.print(produtos[i].exibirCategoria());
			i++;
		}

		scanner.close();
	}

}
