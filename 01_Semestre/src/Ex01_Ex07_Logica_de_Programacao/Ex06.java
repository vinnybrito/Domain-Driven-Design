package Ex01_Ex07_Logica_de_Programacao;

import java.util.Scanner;

public class Ex06 {
	
	// 6-) Entrar via teclado com o valor da cotação do dólar
	// e uma certa quantidade de dólares. Calcular e exibir o
	// valor correspondente em Reais (R$).

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o valor da cotação do dólar atual: ");
		double cotacao = scanner.nextDouble();
		
		System.out.printf("Digite o quantia em dólar desejada: ");
		double dolar = scanner.nextDouble();
		
		double real = cotacao * dolar;
		
		System.out.printf("A quantia em reais é: %.2f", real);
		
		scanner.close();
	}

}
