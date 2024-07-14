package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex17 {
	
	/* 17. Entrar com o peso, o sexo e a altura de uma determinada
	   pessoa. Após a digitação, exibir se esta pessoa está ou não
	   com seu peso ideal. Fórmula: peso/altura². */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o seu peso em Kg: ");
		double peso = scanner.nextDouble();
		
		System.out.printf("Digite a sua altura em metros: ");
		double altura = scanner.nextDouble();
		
		System.out.printf("Insira o seu sexo (m/f): ");
		String sexo = scanner.next();
		
		double imc = peso / (altura * altura);
		
		if (sexo.toUpperCase().equals("M")) {
			if (imc < 20)
				System.out.printf("Abaixo do peso.");
			else if (imc < 25)
				System.out.printf("Peso ideal.");
			else
				System.out.printf("Acima do peso.");
		} else {
			if (imc < 19)
				System.out.printf("Abaixo do peso.");
			else if (imc < 24)
				System.out.printf("Peso ideal.");
			else
				System.out.printf("Acima do peso.");
		}
		
		scanner.close();
	}

}
