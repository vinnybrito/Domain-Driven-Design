package Ex08_Ex30_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex18 {
	
	/* 
	   18. Criar um programa para analisar a velocidade de um
	   automóvel. Solicitar via teclado os valores da aceleração
	   (a em m/s2), velocidade inicial (v0 em m/s) e o tempo de
	   percurso (t em s). Calcular e exibir a velocidade final do
	   automóvel em km/h. E exibir mensagem de acordo com a tabela
	   abaixo: 
	   
	   Fórmula para o cálculo da velocidade em m/s: V = v0 + a. t 
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o valor da aceleração (a em m/s2): ");
		double a = scanner.nextDouble();
		
		System.out.print("Insira o valor da velocidade inicial (v0 em m/s): ");
		double v0 = scanner.nextDouble();
		
		System.out.print("Insira o valor do tempo de percurso (t em s): ");
		double t = scanner.nextDouble();
		
		double v = v0 + (a * t);
		
		if (v <= 40)
			System.out.printf("\nVeículo muito lento.");
		else if (v <= 60)
			System.out.printf("\nVelocidade permitida.");
		else if (v <= 80)
			System.out.printf("\nVelocidade de cruzeiro.");
		else if (v <= 120)
			System.out.printf("\nVeículo rápido.");
		else
			System.out.printf("\nVeículo muito rápido.");
		
		System.out.printf("\nA velocidade é: %.1f", v);
		
		scanner.close();
	}

}
