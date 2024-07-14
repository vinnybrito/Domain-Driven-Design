package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex30 {
	
	/* 30. Elabore um algoritmo que calcule o que deve ser pago por um
	   produto, considerando o preço normal de etiqueta e a escolha da
	   condição de pagamento. Utilize os códigos da tabela a seguir para
	   ler qual a condição de pagamento escolhida e efetuar o cálculo
	   adequado e exibir o valor a ser pago no final.

	   Código Condição de pagamento
	   
	   	1 - À vista em dinheiro ou cheque, recebe 10% de desconto
	   	2 - À vista no cartão de crédito, recebe 15% de desconto
	   	3 - Em duas vezes, preço normal de etiqueta sem juros
	   	4 - Em quatro vezes, preço normal de etiqueta mais juros de 10%  */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double desconto, precoNormal;
		
		System.out.print("Insira o valor do Produto: ");
		double produto = scanner.nextDouble();
		
		System.out.print("\n 1 - À vista em dinheiro ou cheque, recebe 10% de desconto." +
						 "\n 2 - À vista no cartão de crédito, recebe 15% de desconto." +
						 "\n 3 - Em duas vezes, preço normal de etiqueta sem juros." +
						 "\n 4 - Em quatro vezes, preço normal de etiqueta mais juros de 10%.");
		System.out.print("\n\nEscolha a forma de pagamento: ");
		int option = scanner.nextInt();
		
		switch (option) {
			case 1:
				//desconto = produto - (produto * 0.10);
				System.out.printf("Valor com desconto: %.2f", desconto = produto - (produto * 0.10));
				break;
			case 2:
				desconto = produto - (produto * 0.15);
				System.out.print("Valor com desconto: ");
				break;
			case 3:
				System.out.print("Valor sem desconto e sem Juros: ");
				break;
			case 4:
				break;
			default:
				System.out.printf("Não foi possivel idêntificar a forma de pagamento.");
		}
		
		scanner.close();
	}

}
