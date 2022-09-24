package entrada_processamento_saida;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, r;
		
		System.out.printf("Digite um valor qualquer: ");
		n = ler.nextInt();
		
		r = n % 2;
		
		if (r == 0) {
			System.out.printf("É um número par.");
		}else {
			System.out.printf("É um número impar.");
		}

	}

}
