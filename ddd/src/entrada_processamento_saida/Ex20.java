package entrada_processamento_saida;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	    double p1, p2;
		
		System.out.printf("Digite o valor da sua primeira nota: ");
		p1 = ler.nextDouble();
		
		p2 = (15 - p1) / 2;
		
		System.out.printf("Você precisa tirar no mínimo %.2f na segunda prova para conseguir a média.", p2);
	}

}
