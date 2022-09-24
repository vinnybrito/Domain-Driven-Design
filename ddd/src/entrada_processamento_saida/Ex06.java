package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double c, d, r;
		
		System.out.printf("Digite o valor da cotação do dólar atual: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o quantia em dólar desejada: ");
		d = ler.nextDouble();
		
		r = c * d;
		
		System.out.printf("A quantia em reais é: %.2f", r);
		

	}

}
