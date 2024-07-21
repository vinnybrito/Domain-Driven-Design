package Ex08_Ex30_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex11 {
	
	// 11. Calcular e exibir a área de um retângulo, a partir dos
	// valores da base e altura que serão digitados. Se a área for
	// maior que 100, exibir a mensagem “Terreno grande”.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o valor da base do retângulo: ");
		int base = scanner.nextInt();
		
		System.out.print("Insira o valor da altura do retângulo: ");
		int altura = scanner.nextInt();
		
		int area = base * altura;
		
		if (area > 100)
			System.out.println("\nTerreno grande.");

		System.out.printf("A área do retângulo é %d.", area);
		
		scanner.close();
	}

}
