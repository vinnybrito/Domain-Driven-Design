package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double t, pg ,p1, p2, p3, p4, p5;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		p2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		p3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		p4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		p5 = ler.nextDouble();
		
		System.out.printf("Digite o valor do pagamento: ");
		pg = ler.nextDouble();
		
		t = pg - (p1 + p2 + p3 + p4 + p5);
		
		System.out.printf("O valor do troco a ser devolvido é: %.2f", t);

	}

}
