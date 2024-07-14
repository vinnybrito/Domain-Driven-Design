package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex25 {
	
	// 25. Faça um algoritmo para receber um número qualquer e
	// Informal na tela se é par ou ímpar. Utilize o operador %

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		int number = scanner.nextInt();
		
		if ((number % 2) == 0) 
			System.out.print("PAR");
		else
			System.out.print("ÍMPAR");
		
		scanner.close();
	}

}
