package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex41DW {
	
	// 41 - Escreva um programa que solicite ao usuário um valor positivo menor que 100,
	// verifique se o valor está dentro desse intervalo e, se estiver, exiba uma sequência
	// de números onde cada termo é o quadrado do seu índice mais um, somado a 1.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int soma = 0, termo, i = 1;

		System.out.print("Digite o termo que quer encontrar: ");
		int n = scanner.nextInt();

		while ((n <= 0) || (n > 100)){
			System.out.print("\nO valor deve ser positivo e menor que 100.\nDigite novamente: ");
			n = scanner.nextInt();
		}
		
		do {
			termo = ((int) Math.pow(i, 2) + 1);
			System.out.println(i + ". " + termo);
			soma = soma + termo;
			scanner.close();
			i++;
		} while (i <= n);

		System.out.println("\nA soma é: " + soma);

		scanner.close();
	}

}
