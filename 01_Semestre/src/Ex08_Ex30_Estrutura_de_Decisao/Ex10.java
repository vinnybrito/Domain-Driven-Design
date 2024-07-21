package Ex08_Ex30_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex10 {
	
	// 10-) Entrar com dois valores quaisquer. Exibir o maior deles,
	// se existir, caso contrário, enviar mensagem avisando que os
	// números são idênticos.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		if (v1 > v2)
			System.out.println("\nO primeiro valor é o maior.");
		else if (v2 > v1)
			System.out.println("\nO segundo valor é o maior.");
		else
			System.out.println("\nOs dois valores são idênticos.");
		
		scanner.close();
	}

}
