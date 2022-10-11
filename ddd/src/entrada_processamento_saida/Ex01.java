package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, h, a;
		
		System.out.print("Digite a base do retângulo: ");
		b = ler.nextInt();
		
		System.out.print("Digite a altura do retângulo: ");
		h = ler.nextInt();
		
		a = b * h;
		
		System.out.printf("A área do retângulo é: %d", a);

	}

}
