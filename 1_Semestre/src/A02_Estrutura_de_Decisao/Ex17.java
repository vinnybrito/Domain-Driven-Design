package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		/* 17. Entrar com o peso, o sexo e a altura de uma determinada
		   pessoa. Após a digitação, exibir se esta pessoa está ou não
		   com seu peso ideal. Fórmula: peso/altura². */
		
		String sexo;
		double peso, altura, imc;
		
		System.out.printf("Digite o seu peso em Kg: ");
		peso = read.nextDouble();
		
		System.out.printf("Digite a sua altura em metros: ");
		altura = read.nextDouble();
		
		System.out.printf("Insira o seu sexo (m/f): ");
		sexo = read.next();
		
		imc = peso / (altura * altura);
		
		if (sexo.toUpperCase().equals("M")) {
			
			if (imc < 20)
				System.out.printf("Abaixo do peso.");
			else if (imc < 25)
				System.out.printf("Peso ideal.");
			else
				System.out.printf("Acima do peso.");
			
		}
		
		else {
			
			if (imc < 19)
				System.out.printf("Abaixo do peso.");
			else if (imc < 24)
				System.out.printf("Peso ideal.");
			else
				System.out.printf("Acima do peso.");
			
			}

	}

}
