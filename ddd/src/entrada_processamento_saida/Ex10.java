package entrada_processamento_saida;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.printf("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		if (valor1 > valor2) {
			System.out.printf("O primeiro valor é o maior!");
		}else if (valor1 == valor2) {
			System.out.printf("Os valores são idênticos.");
		}else {
			System.out.printf("O segundo valor é o maior!");
		}
	}

}
