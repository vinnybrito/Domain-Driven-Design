package entrada_processamento_saida;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, alt, imc;
		
		System.out.printf("Digite o seu peso em Kg: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua altura em (m): ");
		alt = ler.nextDouble();
		
		imc = peso / (alt * alt);

		if (imc < 20) {
			System.out.printf("Abaixo do peso.");
		}else if (imc < 25) {
			System.out.printf("Peso ideal.");
		}else {
			System.out.printf("Acima do peso.");
		}
	}

}
