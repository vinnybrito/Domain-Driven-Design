package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// 25. Faça um algoritmo para receber um número qualquer e
		// informar na tela se é par ou ímpar. Utilize o operador %
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		int n = read.nextInt();
		
		int r = n % 2;
		
		if (r == 0) {
			System.out.print("O valor digitado é um número par!");
		}
		
		else {
			System.out.print("O valor digitado é um número impar!");
		}

	}

}
