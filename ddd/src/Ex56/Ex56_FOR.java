package Ex56;

import java.util.Scanner;

public class Ex56_FOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto[] listaProduto = new Produto[2];
		
		String resposta;
		
		System.out.println("..:: Cadastro de Produtos ::..");
		
		for(int i=0; i<=1; i++) {
			Produto p = new Produto();
			
			System.out.print("\nID: ");
			p.setId(ler.nextInt());
			
			System.out.print("Produto: ");
			p.setNome(ler.next());
			
			System.out.print("Preço: ");
			p.setPreco(ler.nextDouble());
			
			System.out.print("Quantidade: ");
			p.setQuantidade(ler.nextDouble());
			
			System.out.print("Produto possui categoria?: ");
			resposta = ler.next();
			
			if (resposta.equals("s")) {
				Categoria c = new Categoria();
				
				System.out.print("ID: ");
				c.setId(ler.nextInt());
				
				System.out.print("Nome: ");
				c.setNome(ler.next());
				
				p.setCategoria(c);
			}
			else {
				p.setCategoria(null);
			}	
			listaProduto[i] = p;
		}
		
		System.out.print("..:: Produtos e Categorias ::..");
		
		for(int i=0; i<=1; i++) {
			System.out.print("\n----------------------");
			System.out.print(listaProduto[i].exibirNomePreco());
			
			if (listaProduto[i].getCategoria() != null) {
				System.out.print(listaProduto[i].exibirCategoria());
			}
		}

	}

}
