package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex42F {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double divisao, dividendo = 1, divisor = 2, soma = 0;

		System.out.print("Digite o termo que deseja encontrar: ");
		int n = scanner.nextInt();

		while ((n <= 0) || (n > 50)) {
			System.out.print("\nO valor deve ser positivo e menor que 50.\nDigite novamente: ");
			n = scanner.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			divisao = dividendo / divisor;
			soma = soma + divisao;
			System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
			dividendo++;
			divisor++;
		}
		
		System.out.printf("A soma é: %.2f", soma);

		scanner.close();
	}

}
