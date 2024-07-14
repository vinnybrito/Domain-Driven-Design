package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex13 {
	
	// 13. Entrar via teclado com três valores distintos.
	// Exibir o maior deles.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		int v2 = scanner.nextInt();
		
		System.out.print("Insira o terceiro valor: ");
		int v3 = scanner.nextInt();
		
		if ( (v1 > v2) && (v1 > v3) )
			System.out.println("\nO primeiro valor é o maior.");
		else if ( (v2 > v1) && (v2 > v3) )
			System.out.println("\nO segundo valor é o maior.");
		else
			System.out.println("\nO terceiro valor é o maior.");
		
		scanner.close();
	}

}
