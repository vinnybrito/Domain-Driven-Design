package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex31W {
	
	// 31. Criar uma rotina de entrada que aceite
	// somente um valor positivo. (Use o WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Insira um valor positivo: ");
		valor = scanner.nextInt();
		
		while (valor < 0) {
			System.out.print("O valor precisa ser positivo, digite novamente: ");
			valor = scanner.nextInt();
		}
		
		System.out.print("Número positivo registrado com sucesso!");
	}

}
