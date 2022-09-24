package entrada_processamento_saida;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, m;
		
		System.out.printf("Digite o valor da primeira nota: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor da segunda nota: ");
		p2 = ler.nextDouble();
		
		m = (p1 + (p2 * 2)) / 3;
		
		if (m >= 5) {
			System.out.printf("Aprovado.");
		}else {
			System.out.printf("Reprovado.");
		}
		
		
	}

}
