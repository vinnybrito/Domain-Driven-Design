package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 14. Entrar com o peso e a altura de uma determinada pessoa.
		// Após a digitação, exibir se esta pessoa está ou não com seu
		// peso ideal. Fórmula: peso/altura².
		
		System.out.print("Digite o seu peso: ");
		double peso = read.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = read.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.print("Abaixo do peso!");
		}
		
		else if (imc < 25) {
			System.out.print("Peso ideal!");
		}
		
		else {
			System.out.print("Peso ideal!");
		}

	}

}
