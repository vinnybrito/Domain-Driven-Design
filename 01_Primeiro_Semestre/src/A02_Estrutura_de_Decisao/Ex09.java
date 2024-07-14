package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex09 {
	
	// 9-) Entrar via teclado, com dois valores distintos. 
	// Exibir o menor deles.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		if (v1 < v2)
			System.out.println("O primeiro valor é o menor");
		else 
			System.out.println("O segundo valor é o menor");
		
		scanner.close();
	}

}
