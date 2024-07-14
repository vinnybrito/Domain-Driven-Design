package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex35DW {
	
	// 35. Entrar via teclado com um valor qualquer. Travar a
	// digitação, no sentido de aceitar somente valores positivos.
	// Após a digitação, exibir a tabuada do valor solicitado, no
	// intervalo de um a dez. (DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.print("Digite um valor qualquer: ");
			valor = scanner.nextInt();
		} while (valor < 0);
		
		
		int i = 0;
		
		do {
			int tabuada = valor * i;
			System.out.printf("\n%d X %d = %d", valor, i, tabuada);
			i++;
		} while (i <= 10);
		
		scanner.close();
	}

}
