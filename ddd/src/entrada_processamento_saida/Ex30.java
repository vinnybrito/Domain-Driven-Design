package entrada_processamento_saida;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double p, d, j;
		String fp;
		
		System.out.printf("Digite o valor do produto: ");
		p = ler.nextDouble();
		
		System.out.printf(" 1- Dinheiro ou Cheque\n 2- Cartão de crédito\n 3- Duas parcelas\n 4- Quatro parcelas\n Insira a forma de pagamento: ");
		fp = ler.next();
		
		if (fp.equals("1")) {
			d = p - (0.10 * p);
			System.out.printf("Seu desconto é de 10 porcento. O produto custará %.2f reais.", d);
		}else if (fp.equals("2")) {
			d = p - (0.15 * p);
			System.out.printf("Seu desconto é de 15 porcento. O produto custará %.2f reais.", d);
		}else if (fp.equals("3")) {
			System.out.printf("Produto sem desconto. O produto custará %.2f reais.", p);
		}else if (fp.equals("4")){
			d =(p * 0.10);
			j = d * 4 + p;
			System.out.printf("Produto com juros de 10 porcento. A cada parcela, será cobrado o valor de %.2f reais. O valor total a ser pago será de %.2f reais.", d, j);
		}else {
			System.out.printf("Não foi possivel idêntificar a forma de pagamento.");
		}
	}

}
