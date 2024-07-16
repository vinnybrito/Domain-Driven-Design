package Ex31_Ex47_Lacos_de_Repeticao;

import java.io.IOException;
import java.util.Scanner;

public class Ex37F {
	
	// 37. Exibir a tabuada dos valores de um a vinte, no intervalo
	// de um a dez. Entre as tabuadas, solicitar que o usuário pressione
	// uma tecla. (FOR)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int j = 1; j <= 20; j++) {
			for (int i = 1; i <= 10; i++) {
				int resultado = j * i;
				System.out.printf("\n%d X %d = %d", j, i, resultado);
			}
			System.out.printf("\n\nDigite qualquer tecla para continuar...");
			scanner.nextLine();
		}
		
		System.out.printf("\nFim da Tabuada.");

		scanner.close();
	}

}
