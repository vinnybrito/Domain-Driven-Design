package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex43F {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double soma = 0, dividendo, divisor, divisao;

		System.out.println("Digite o termo que quer encontrar: ");
		double n = scanner.nextInt();

		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor precisa ser positivo e menor que 50.\nDigite novamente: ");
			n = scanner.nextInt();
		}

		for (double i = 1; i <= n; i++) {
			dividendo = (Math.pow(i, 2)) + 1;
			divisor = (Math.pow(i, 3));
			divisao = dividendo / divisor;
			System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
			soma = soma + divisao;
		}

		System.out.printf("A soma é: %.2f", soma);

		scanner.close();
	}

}
