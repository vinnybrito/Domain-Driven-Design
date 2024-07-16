package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex37W {
	
	// 37. Exibir a tabuada dos valores de um a vinte, no intervalo
	// de um a dez. Entre as tabuadas, solicitar que o usuário pressione
	// uma tecla. (WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int j = 1, i, resultado;
		
		while (j <= 20) {
			i = 1;
			while (i <= 10) {
				resultado = j * i;
				System.out.printf("\n%d X %d = %d", j, i, resultado);
				i++;
			}
			j++;
			
			System.out.printf("\n\nDigite qualquer tecla para continuar...");
			scanner.nextLine();
		}
		
		System.out.printf("\nFim da Tabuada.");

		scanner.close();
	}

}
