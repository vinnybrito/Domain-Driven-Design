package Ex31_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex31DW {
	
	// 31. Criar uma rotina de entrada que aceite
	// somente um valor positivo. (Use o DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.print("Insira um valor positivo: ");
			valor = scanner.nextInt();
		} while (valor < 0);
		
		System.out.print("Número positivo registrado com sucesso!");
		
		scanner.close();
	}

}
