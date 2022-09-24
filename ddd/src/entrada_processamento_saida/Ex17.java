package entrada_processamento_saida;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, alt, imc;
		String sex;
		
		System.out.printf("Digite o seu peso em Kg: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua altura em metros: ");
		alt = ler.nextDouble();
		
		System.out.printf("Insira o seu sexo (Masculino = m / Feminino = f): ");
		sex = ler.next();
		
		imc = peso / (alt * alt);
		
		if (sex.toUpperCase().equals("M")) {
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
