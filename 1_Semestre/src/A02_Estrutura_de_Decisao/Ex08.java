package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 8-) Entrar via teclado, com dois valores distintos.
		// Exibir o maior deles.
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = read.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = read.nextInt();
		
		if (v1 > v2) 
			System.out.print("O primeiro valor é o maior!");
		else
			System.out.print("O segundo valor é o maior!");
	}

}
