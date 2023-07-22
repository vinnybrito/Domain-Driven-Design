package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex32W {

	public static void main(String[] args) {
		// 32. Entrar com dois valores via teclado, onde o segundo
		// deverá ser maior que o primeiro. Caso contrário solicitar
		// novamente apenas o segundo valor. (WHILE)
		
		Scanner read = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = read.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		v2 = read.nextInt();
		
		while (v2 < v1) {
			System.out.print("ERRO. O segundo valor precisa "
							+ "ser maior que o primeiro: ");
			
			System.out.print("\nDigite o segundo valor: ");
			v2 = read.nextInt();
		}
		
		System.out.print("Valores registrados com sucesso!");

	}

}
