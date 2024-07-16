package Ex58_ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	// 58 - Crie um sistema com as classes conforme o Diagrama de Classe (UML) abaixo. 
	// Crie Getters e Setters para todos os atributos das classes. Crie um programa que
	// utilize essas classes para cadastrar 5 produtos em uma lista de produtos e pergunte
	// para cada produto se ele tem ou não uma categoria. Caso o produto tenha, permita
	// ele cadastrar os dados da categoria. Ao final, exibir todos os produtos e suas
	// respectivas categorias, se houver

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		Produto prod;
		int opcao, id, id_Produto, indexProduto;
		
		do {
			System.out.print("\n<<---- CADASTRO DE PRODUTOS ---->>");        
	        System.out.printf("\n\nEscolha uma opção:" +
	        				  "\n 1 - Incluir" +
	                          "\n 2 - Atualizar" +
	                          "\n 3 - Excluir" +
	                          "\n 4 - Exibir" +
	                          "\n 5 - Sair\n\n");
	        System.out.printf("Digite a opção desejada: ");
	        opcao = scanner.nextInt();
	        
	        if (opcao == 1) {
	        	Produto produto = new Produto();
	        	
	        	id_Produto = produto.gerarId(listaProdutos);
	        	
	        	produto.setId(id_Produto);
	        	
	        	System.out.print("Produto: ");
	        	produto.setNome(scanner.next());
	        	
	        	System.out.print("Preço: ");
	        	produto.setPreco(scanner.nextDouble());
	        	
	        	System.out.print("Quantidade: ");
	        	produto.setQuantidade(scanner.nextDouble());
	        	
	        	System.out.print("Produto possuí categoria? (S/N): ");
	        	String resposta = scanner.next().toUpperCase();
	        	
	        	produto.setCategoria(null);
	        	
	        	if (resposta.equals("S")) {
	        		Categoria categoria = new Categoria();
	        		
	        		System.out.print("Código: ");
	        		categoria.setId(scanner.nextInt());
	        		
	        		System.out.print("Marca: ");
	        		categoria.setNome(scanner.next());
	        		
	        		produto.setCategoria(categoria);
	        	}
	        	
	        	listaProdutos.add(produto);
	        	
	        	System.out.print("\nProduto cadastrado com sucesso!");
	        	System.in.read();
	        	
	        } else if (opcao == 2) {
	        	
	        	for (Produto produto: listaProdutos) {
	        		System.out.print(produto.exibirProduto());
	        	}
	        	
	        	System.out.print("Digite o ID no produto que deseja atualizar: ");
	        	id = scanner.nextInt();
	        	
	        	indexProduto = -1;
	        	
	        	for (Produto p: listaProdutos) {
	        		if (p.getId() == id) {
	        			indexProduto = listaProdutos.indexOf(p);
	        			break;
	        		}
	        	}
	        	
	        	if (indexProduto != -1) {
	        		prod = listaProdutos.get(indexProduto);
	        		
	        		System.out.print("Novo Produto: ");
		        	prod.setNome(scanner.next());
		        	
		        	System.out.print("Novo Preço: ");
		        	prod.setPreco(scanner.nextDouble());
		        	
		        	System.out.print("Nova Quantidade: ");
		        	prod.setQuantidade(scanner.nextDouble());
		        	
		        	System.out.print("\nProduto atualizado com sucesso!");
	        	} else {
	        		System.out.print("Produto Não encontrado!");
	        	}
	        	
	        	System.in.read();
	        	
	        } else if (opcao == 3) {
	        	
	        	for (Produto produto: listaProdutos) {
	        		System.out.print(produto.exibirProduto());
	        	}
	        	
	        	System.out.print("Digite o ID do produto que seja excluir: ");
	        	id = scanner.nextInt();
	        	
	        	indexProduto = -1;
	        	
	        	for (Produto produto: listaProdutos) {
	        		if (produto.getId() == id) {
	        			indexProduto = listaProdutos.indexOf(produto);
	        			break;
	        		}
	        	}
	        	
	        	if (indexProduto != -1) {
	        		listaProdutos.remove(indexProduto);
	        		System.out.print("Produto excluido com sucesso!");
	        	} else {
	        		System.out.print("Produto não encontrado!");
	        	}
	        	
	        	System.in.read();
	        	
	        } else if (opcao == 4) {
	        	
	        	for (Produto produto: listaProdutos) {
	        		System.out.print(produto.exibirProduto());
	        		if (produto.getCategoria() != null)
	        			System.out.print(produto.exibirCategoria());
	        	}
	        	
	        	System.in.read();
	        }
			
		} while ((opcao >= 1) && (opcao <= 4));
		
		System.out.print("\nFim do cadastro!");

		scanner.close();
	}

}
