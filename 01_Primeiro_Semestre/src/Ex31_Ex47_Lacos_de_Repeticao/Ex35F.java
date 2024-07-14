package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex35F {
	
	// 35. Entrar via teclado com um valor qualquer. Travar a
	// digitação, no sentido de aceitar somente valores positivos.
	// Após a digitação, exibir a tabuada do valor solicitado, no
	// intervalo de um a dez. (FOR)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor qualquer: ");
		int valor = scanner.nextInt();
		
		while (valor < 0) {
			System.out.print("O valor precisa ser positivo, digite novamente: ");
			valor = scanner.nextInt();
		}
		
		for (int i = 0; i <= 10; i++) {
			int tabuada = valor * i;
			System.out.printf("\n%d X %d = %d", valor, i, tabuada);
		}
		
		scanner.close();
	}

}
