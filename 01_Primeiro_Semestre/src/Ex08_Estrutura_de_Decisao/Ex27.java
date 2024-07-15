package Ex08_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex27 {
	
	// 27. Faça um algoritmo que leia uma variável e some 5 caso seja
	// par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result;
		
		System.out.print("Digite um valor qualquer: ");
		int number = scanner.nextInt();
		
		if ((number % 2) == 0)
			System.out.printf("%d + 5 = %d", number, result = number + 5);
		else
			System.out.printf("%d + 8 = %d", number, result = number + 8);

		scanner.close();
	}

}
