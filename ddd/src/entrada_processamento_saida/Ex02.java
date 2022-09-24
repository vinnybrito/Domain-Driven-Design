package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int l, a;
		
		System.out.printf("Digite o valor da aresta do quadrado: ");
		l = ler.nextInt();
		
		a = l * l;
		
		System.out.printf("A área do quadrado é: %d", a);

	}

}
