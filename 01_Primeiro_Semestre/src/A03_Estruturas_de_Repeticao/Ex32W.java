package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex32W {
	
	// 32. Entrar com dois valores via teclado, onde o segundo
	// deverá ser maior que o primeiro. Caso contrário solicitar
	// novamente apenas o segundo valor. (use o WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		while (v2 < v1) {
			System.out.print("O segundo valor precisa ser maior que o primeiro, digite novamente: ");
			v2 = scanner.nextInt();
		}
		
		System.out.print("Valores registrados com sucesso!");
		
		scanner.close();
	}

}
