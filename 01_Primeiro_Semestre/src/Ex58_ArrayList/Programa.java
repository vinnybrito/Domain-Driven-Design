package Ex58_ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		Produto prod;
		int opcao, id, id_Produto, indexProduto;
		
		do {
			System.out.print("\n<<-- SISTEMA DE CADASTRO DE PRODUTOS -->>");
			System.out.printf("\n\nEscolha uma opção:\n");          
	        System.out.printf("1 - Incluir \n" +
	                          "2 - Atualizar \n" +
	                          "3 - Excluir \n" +
	                          "4 - Exibir \n" +
	                          "5 - Sair\n\n");
	        System.out.printf("Digite a opção desejada: ");
	        opcao = read.nextInt();
	        
	        //---------------- PRIMEIRA OPÇÃO ----------------//
	        
	        if (opcao == 1) {
	        	
	        	Produto p = new Produto();
	        	
	        	if (listaProdutos.size() != 0) 
	        		id_Produto = listaProdutos.get(listaProdutos.size() -1).getId() + 1;
	        	else 
	        		id_Produto = 1;
	        	
	        	p.setId(id_Produto);
	        	
	        	System.out.print("Produto: ");
	        	p.setNome(read.next());
	        	
	        	System.out.print("Preço: ");
	        	p.setPreco(read.nextDouble());
	        	
	        	System.out.print("Quantidade: ");
	        	p.setQuantidade(read.nextDouble());
	        	
	        	System.out.print("Produto possuí categoria? (S/N): ");
	        	String resposta = read.next().toUpperCase();
	        	
	        	if (resposta.equals("S")) {
	        		
	        		Categoria c = new Categoria();
	        		
	        		System.out.print("Código: ");
	        		c.setId(read.nextInt());
	        		
	        		System.out.print("Marca: ");
	        		c.setNome(read.next());
	        		
	        		p.setCategoria(c);
	        		
	        	}
	        	
	        	else {
	        		p.setCategoria(null);
	        	}
	        	
	        	listaProdutos.add(p);
	        	
	        	System.out.print("\nProduto cadastrado com sucesso!");
	        	System.in.read();
	        	
	        }
	        
	        //---------------- SEGUNDA OPÇÃO ----------------//
	        
	        else if (opcao == 2) {
	        	
	        	for (Produto p: listaProdutos) {
	        		System.out.print(p.exibirProduto());
	        	}
	        	
	        	System.out.print("Digite o ID no produto que deseja atualizar: ");
	        	id = read.nextInt();
	        	
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
		        	prod.setNome(read.next());
		        	
		        	System.out.print("Novo Preço: ");
		        	prod.setPreco(read.nextDouble());
		        	
		        	System.out.print("Nova Quantidade: ");
		        	prod.setQuantidade(read.nextDouble());
		        	
		        	System.out.print("\nProduto atualizado com sucesso!");
	        	}
	        	
	        	else {
	        		System.out.print("Produto Não encontrado!");
	        	}
	        	
	        	System.in.read();
	        }
	        
	        //---------------- TERCEIRA OPÇÃO ----------------//
	        
	        else if (opcao == 3) {
	        	
	        	for (Produto p: listaProdutos) {
	        		System.out.print(p.exibirProduto());
	        	}
	        	
	        	System.out.print("Digite o ID do produto que seja excluir: ");
	        	id = read.nextInt();
	        	
	        	indexProduto = -1;
	        	
	        	for (Produto p: listaProdutos) {
	        		if (p.getId() == id) {
	        			indexProduto = listaProdutos.indexOf(p);
	        			break;
	        		}
	        	}
	        	
	        	if (indexProduto != -1) {
	        		listaProdutos.remove(indexProduto);
	        		System.out.print("Produto excluido com sucesso!");
	        	}
	        	
	        	else {
	        		System.out.print("Produto não encontrado!");
	        	}
	        	
	        	System.in.read();
	        }
	        
	        //---------------- QUARTA OPÇÃO ----------------//
	        
	        else if (opcao == 4) {
	        	
	        	for (Produto p: listaProdutos) {
	        		System.out.print(p.exibirProduto());
	        		
	        		if (p.getCategoria() != null) {
	        			System.out.print(p.exibirCategoria());
	        		}
	        	}
	        	
	        	System.in.read();
	        }
			
		} while ((opcao >= 1) && (opcao <= 4));
		
		System.out.print("\nFim do cadastro!");

	}

}
