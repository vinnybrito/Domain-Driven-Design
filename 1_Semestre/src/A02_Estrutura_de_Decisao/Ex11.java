package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 11. Calcular e exibir a área de um retângulo, a partir dos
		// valores da base e altura que serão digitados. Se a área for
		// maior que 100, exibir a mensagem “Terreno grande”.
		
		System.out.print("Digite o valor da base do retângulo: ");
		double base = read.nextDouble();
		
		System.out.print("Digite o valor da altura do retângulo: ");
		double altura = read.nextDouble();
		
		double area = base * altura;
		
		if (area > 100)
			System.out.print("Terreno Grande!");
		else
			System.out.printf("Área do terreno é %.2f!", area);

	}

}
