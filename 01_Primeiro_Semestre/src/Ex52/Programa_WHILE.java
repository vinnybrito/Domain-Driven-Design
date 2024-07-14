package Ex52;

import java.util.Scanner;

public class Programa_WHILE {
	
	// 52. Crie uma classe conforme o Diagrama de Classe (UML). 
	// Crie um programa que utilize essa classe para cadastrar 
	// 10 produtos em uma lista de produtos. Ao final exibir apenas
	// os produtos cujo valor é menor do que 100 reais. (use o WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Produto[] produtos = new Produto[5];
		
		int i = 0;
		
		while (i <= 4) {
			Produto produto = new Produto();
			
			System.out.print("\nID do produto: ");
			produto.id = scanner.nextInt();
			
			System.out.print("Descrição do produto: ");
			produto.descricao = scanner.next();
			
			System.out.print("Valor do produto: ");
			produto.valor = scanner.nextDouble();
			
			System.out.print("Quantidade do produto: ");
			produto.quantidade = scanner.nextDouble();
			
			produtos[i] = produto;
			
			i++;
		}
		
		System.out.print("\nProdutos com o valor menor que R$100,00: ");
		
		i = 0;
		
		while (i <= 4) {
			if (produtos[i].valor < 100)
				System.out.print("\nProdutos: " + produtos[i].descricao + 
						         " - Valor: " + produtos[i].valor);
			i++;
		}

		scanner.close();
	}

}
