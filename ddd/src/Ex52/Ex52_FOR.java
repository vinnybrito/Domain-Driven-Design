package Ex52;

import java.util.Scanner;

public class Ex52_FOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto[] listaProduto = new Produto[3];
		
		System.out.println("..::Dados do Produto::..");
		
		for(int i=0; i <= 2; i++) {
			Produto p = new Produto();
			
			System.out.print("\nDigite o ID: ");
			p.id = ler.nextInt();
			
			System.out.print("Tipo de produto: ");
			p.descricao = ler.next();
			
			System.out.print("Valor do produto: ");
			p.valor = ler.nextDouble();
			
			System.out.print("Quantidade do produto: ");
			p.quantidade = ler.nextDouble();
			
			listaProduto[i] = p;
		}
		
		System.out.println("\n..::Produtos com valores abaixo de 100 reais::..");
		
		for(int i=0; i <= 2; i++) {
			if (listaProduto[i].valor < 100) {
				System.out.print("\n--------------------");
				System.out.println("\nId: " + listaProduto[i].id + "\nProduto: " + listaProduto[i].descricao + "\nValor: " + listaProduto[i].valor + "\nQuantidade: " + listaProduto[i].quantidade);
			}
		}

	}

}
