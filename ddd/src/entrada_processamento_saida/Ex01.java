package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, h, a;
		
		System.out.printf("Digite o valor da base do retângulo: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retângulo: ");
		h = ler.nextInt();
		
		a = b * h;
		
		System.out.printf("A área do retângulo é: %d", a);
		
	}

}
