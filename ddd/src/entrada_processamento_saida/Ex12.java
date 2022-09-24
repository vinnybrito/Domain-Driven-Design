package entrada_processamento_saida;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		double b, h, a;
		
		System.out.printf("Digite o valor da base do retângulo: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura do retângulo: ");
		h = ler.nextDouble();
		
		a = b * h;
		
		if (a > 100) {
			System.out.printf("Terreno Grande!");
		}else {
			System.out.printf("Terreno Pequeno!");
		}
	}

}
