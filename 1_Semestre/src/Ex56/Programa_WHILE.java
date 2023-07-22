package Ex56;

import java.util.Scanner;

public class Programa_WHILE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[2];
		
		System.out.print("\n<<--- CADASTRO DE PRODUTOS --->>\n");
		
		int i = 0;
		
		while (i <= 1) {
			
			Produto p = new Produto();
			
			System.out.print("\nID: ");
			p.setId(read.nextInt());
			
			System.out.print("Nome: ");
			p.setNome(read.next());
			
			System.out.print("Preço: ");
			p.setPreco(read.nextDouble());
			
			System.out.print("Quantidade: ");
			p.setQuantidade(read.nextDouble());
			
			System.out.print("Produto possuí categoria? (S/N): ");
			String resposta = read.next();
			
			if (resposta.equalsIgnoreCase("S")) {
				
				Categoria c = new Categoria();
				
				System.out.print("ID Categoria: ");
				c.setId(read.nextInt());
				
				System.out.print("Nome Categoria: ");
				c.setNome(read.next());
				
				p.setCategoria(c);
			}
			
			else {
				p.setCategoria(null);
			}
			
			listaProdutos[i] = p;
			i++;
			
		} 
		
		System.out.print("\n<<--- PRODUTOS CADASTRADOS --->>\n");
		
		i = 0;
		
		while (i <= 1) {
			System.out.print(listaProdutos[i].exibirNomePreco());
			
			if (listaProdutos[i].getCategoria() != null) {
				System.out.print(listaProdutos[i].exibirCategoria());
			}
			
			i++;
			
		} 

	}

}
