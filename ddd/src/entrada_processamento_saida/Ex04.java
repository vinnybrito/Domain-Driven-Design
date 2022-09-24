package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3, v4, m;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor: ");
		v4 = ler.nextDouble();
		
		m = (v1 + v2 + v3 + v4) / 4;
		
		System.out.printf("A média aritmética dos quatro valores é: %.2f", m);

	}

}
