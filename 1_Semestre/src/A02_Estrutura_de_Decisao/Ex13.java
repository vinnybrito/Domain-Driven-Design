package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// 13. Entrar via teclado com três valores distintos.
		// Exibir o maior deles.
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = read.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = read.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int v3 = read.nextInt();
		
		if ((v1 > v2) && (v1 > v3)) {
			System.out.print("O primeiro valor é o maior!");
		}
		
		else if ((v2 > v1) && (v2 > v3)) {
			System.out.print("O segundo valor é o maior!");
		}
		
		else
			System.out.print("O terceiro valor é o maior!");

	}

}
