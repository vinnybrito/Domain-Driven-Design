package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex36F {
	
	// 36. Entrar via teclado com um valor (X) qualquer. Travar
	// a digitação, no sentido de aceitar somente valores positivos.
	// Solicitar o intervalo que o programa que deverá calcular a
	// tabuada do valor digitado, sendo que o segundo valor (B),
	// deverá ser maior que o primeiro (A), caso contrário, digitar
	// novamente somente o segundo. Após a validação dos dados, exibir
	// a tabuada do valor digitado, no intervalo decrescente, ou seja,
	// a tabuada de X no intervalo de B para A. (FOR)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da tabuada que deseja acessar: ");
		int valor = scanner.nextInt();
		
		while (valor < 0) {
			System.out.print("O valor precisa ser positivo, digite novamente: ");
			valor = scanner.nextInt();
		}
		
		System.out.print("Digite o valor que inicia a tabuada: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o valor que finalize a tabuada: ");
		int b = scanner.nextInt();
		
		while (b < a) {
			System.out.print("O segundo valor precisa ser o maior: ");
			b = scanner.nextInt();
		}
		
		for (int i = b; i >= a; i--) {
			int tabuada = valor * i;
			System.out.printf("\n%d X %d = %d", valor, i, tabuada);
		}
		
		scanner.close();
	}

}
