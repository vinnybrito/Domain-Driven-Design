package entrada_processamento_saida;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();

		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		
		if (a + b < c) {
			System.out.printf("A soma dos dois primeiros números é menor que o terceiro.");
		}else {
			System.out.printf("A soma dos dois primeiros números é maior que o terceiro.");
		}
	}

}
