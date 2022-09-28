package classe_e_atributo;

import java.util.Scanner;

public class Ex52W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto[] listaproduto = new Produto[10];
		
		int i = 0;
		
		while (i <= 9){
			Produto p = new Produto();
			
			System.out.print("Digite o ID: ");
			p.id = ler.nextInt();
			
			System.out.print("Insira a descrição do produto: ");
			p.descricao = ler.next();
			
			System.out.print("Digite o valor do produto: ");
			p.valor = ler.nextInt();
			
			System.out.print("Digite a quantidade: ");
			p.quantidade = ler.nextInt();
			
			listaproduto[i] = p;
			i++;
		}
		i = 0;
		
		while (i <= 9) {
			if (listaproduto[i].valor < 100) {
				
				System.out.println("ID: " + listaproduto[i].id);
				System.out.println("Descrição: " + listaproduto[i].descricao);
				System.out.println("Preço: " + listaproduto[i].valor);
				System.out.println("Quantidade: " + listaproduto[i].quantidade);
			}
			i++;
		}

	}

}
