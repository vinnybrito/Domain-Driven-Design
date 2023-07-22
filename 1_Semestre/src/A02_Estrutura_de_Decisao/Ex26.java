package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// 26. Encontrar o dobro de um número caso ele seja positivo
		// e o seu triplo caso seja negativo, imprimindo o resultado.
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um valor qualquer: ");
		int n = read.nextInt();
		
		int r = n % 2;
		
		if (r == 0) {
			
			int d = n * 2;
			System.out.printf("O dobro de %d é %d", n, d);
		}
		
		else {
			
			int d = n * 3;
			System.out.printf("O triplo de %d é %d", n, d);
			
		}

	}

}
