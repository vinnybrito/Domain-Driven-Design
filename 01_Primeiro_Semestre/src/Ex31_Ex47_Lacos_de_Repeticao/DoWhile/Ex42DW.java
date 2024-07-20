package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex42DW {
	
	// 42 - Solicite ao usuário que digite um número positivo menor que 50. 
	// Em seguida, calcule e exiba uma sequência de números onde cada número 
	// é o resultado da soma de a e b, dividido por b, para os primeiros 
	// valores até o número digitado pelo usuário.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double divisao, dividendo = 1, divisor = 2, soma = 0;

		System.out.print("Digite o termo que deseja encontrar: ");
		int n = scanner.nextInt();

		while ((n <= 0) || (n > 50)) {
			System.out.print("O valor deve ser positivo e menor que 50.\nDigite novamente: ");
			n = scanner.nextInt();
		}
		
		int i = 1;
		
		do {
			divisao = dividendo / divisor;
			soma = soma + divisao;
			System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
			dividendo++;
			divisor++;
			i++;
		} while (i <= n);
		
		System.out.printf("A soma é: %.2f", soma);

		scanner.close();
	}

}
