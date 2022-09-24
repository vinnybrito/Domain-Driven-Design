package entrada_processamento_saida;

import java.util.Scanner;

public class Ex38F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r = 0, i;
		
		for(i = 1; i <= 100; i++) {
			r = r + i;
			System.out.printf(" \nValor total é: %d", r);
		}

	}

}
