package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
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
		
		Scanner ler = new Scanner(System.in);

		double d, j;
		
		System.out.print("Digite o valor do produto: ");
		double p = ler.nextDouble();
		
		System.out.print(" 1- Dinheiro ou Cheque"
				        + "\n 2- Cartão de crédito"
				        + "\n 3- Duas parcelas"
				        + "\n 4- Quatro parcelas");
				       
		System.out.print("\n Insira a forma de pagamento: ");
		String fp = ler.next();
		
		if (fp.equals("1")) {	
			d = p - (0.10 * p);
			System.out.printf("Seu desconto é de 10 porcento. "
					        + "O produto custará %.2f reais.", d);
		}
		
		else if (fp.equals("2")) {
			d = p - (0.15 * p);
			System.out.printf("Seu desconto é de 15 porcento. "
					        + "O produto custará %.2f reais.", d);
		}
		
		else if (fp.equals("3")) {
			System.out.printf("Produto sem desconto. O produto "
					        + "custará %.2f reais.", p);
		}
		
		else if (fp.equals("4")) {
			d =(p * 0.10);
			j = d * 4 + p;
			System.out.printf("Produto com juros de 10 porcento. "
					        + "A cada parcela, será cobrado o valor "
					        + "de %.2f reais. O valor total a ser pago"
					        + " será de %.2f reais.", d, j);
		}
		
		else {
			System.out.printf("Não foi possivel idêntificar "
					        + "a forma de pagamento.");
		}

	}

}
