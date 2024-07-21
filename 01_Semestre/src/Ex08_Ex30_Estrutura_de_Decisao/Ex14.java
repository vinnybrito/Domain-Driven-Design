package Ex08_Ex30_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex14 {
	
	// 14. Entrar com o peso e a altura de uma determinada pessoa.
	// Após a digitação, exibir se esta pessoa está ou não com seu
	// peso ideal. Fórmula: peso/altura².

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 20)
			System.out.print("\nAbaixo do peso!");
		else if (imc < 25)
			System.out.print("\nPeso ideal!");
		else
			System.out.print("\nPeso ideal!");
		
		scanner.close();
	}

}
