package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int b, h, a;
		
		System.out.printf("Digite o valor da base do triângulo: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do triângulo: ");
		h = ler.nextInt();
		
		a = (b * h)/ 2;
		
		System.out.printf("A área do triângulo é: %d", a);
		
	}

}
