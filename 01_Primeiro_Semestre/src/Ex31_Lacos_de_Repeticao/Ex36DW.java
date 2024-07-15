package Ex31_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex36DW {
	
	// 36. Entrar via teclado com um valor (X) qualquer. Travar
	// a digitação, no sentido de aceitar somente valores positivos.
	// Solicitar o intervalo que o programa que deverá calcular a
	// tabuada do valor digitado, sendo que o segundo valor (B),
	// deverá ser maior que o primeiro (A), caso contrário, digitar
	// novamente somente o segundo. Após a validação dos dados, exibir
	// a tabuada do valor digitado, no intervalo decrescente, ou seja,
	// a tabuada de X no intervalo de B para A. (DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.print("Digite o valor da tabuada que deseja acessar: ");
			valor = scanner.nextInt();
		} while (valor < 0);
		
		System.out.print("Digite o valor que inicia a tabuada: ");
		int a = scanner.nextInt();

		int b;
		
		do {
			System.out.print("Digite o valor que finalize a tabuada. ");
			System.out.print("\nO segundo valor precisa ser o maior: ");
			b = scanner.nextInt();
		} while (b < a);
		
		int i = b;
		
		do {
			int tabuada = valor * i;
			System.out.printf("\n%d X %d = %d", valor, i, tabuada);
			i--;
		} while (i >= a);
		
		scanner.close();
	}

}
